package day30.eDesigner;

/**
 * @Description
 */
public class Consumer extends Thread {
    // 消费者需要知道，从哪一个橱柜中获取汉堡
    private Box box;
    // 消费者吃一个汉堡需要多长时间
    private long timeMillions;

    public Consumer(String name, long timeMillions, Box box) {
        super(name);
        this.timeMillions = timeMillions;
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            // 线程休眠，模拟消费的时间
            try {
                Thread.sleep(this.timeMillions);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 1. 从橱柜中获取一个产品
            Hamburg hamburg = this.box.pop();
            // 2. 打印消费日志
            System.out.printf("消费者 ==> %s 消费了一个汉堡, id: %d, 名字: %s \n", getName(), hamburg.getId(), hamburg.getName());
            // 3.
            hamburg = null;
        }
    }
}
