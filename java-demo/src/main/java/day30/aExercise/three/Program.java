package day30.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 实例化三个线程对象
        MyThread thread1 = new MyThread("线程1", 100);
        MyThread thread2 = new MyThread("线程2", 200);
        MyThread thread3 = new MyThread("线程3", 300);

        // 启动线程
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread extends Thread {
    // 定义线程休眠时间
    private long timeInterval;

    public MyThread() {}
    public MyThread(String name, long timeInterval) {
        super(name);
        // 设置休眠的时间
        this.timeInterval = timeInterval;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + " : " + i);
            try {
                // 休眠指定的时间
                Thread.sleep(timeInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
