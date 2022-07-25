package day30.aExercise.four;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化两个线程
        Thread thread0 = new Thread(new MyTask(10, 20, "图片"), "图片下载线程");
        Thread thread1 = new Thread(new MyTask(20, 10, "数据"), "数据下载线程");
        // 2. 开启线程
        thread0.start();
        thread1.start();
    }
}

class MyTask implements Runnable {

    private int loopTime;           // 循环的次数
    private int taskInterval;       // 休眠的时间
    private String dataType;        // 数据的类型

    public MyTask(int loopTime, int taskInterval, String dataType) {
        this.loopTime = loopTime;
        this.taskInterval = taskInterval;
        this.dataType = dataType;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.loopTime; i++) {
            System.out.println(Thread.currentThread().getName() + " 下载到了一个 " + this.dataType);
            try {
                // 线程休眠，休眠指定的时间
                Thread.sleep(this.taskInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}