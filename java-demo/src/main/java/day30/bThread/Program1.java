package day30.bThread;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description
 */
public class Program1 {
    // 需求:
    // 某一个景点一天一共放出100张票
    // 这个景点有4个售票窗口在同时卖票
    // 输出每一个售票窗口卖票的详情
    private static int restCount = 100;     // 记录余票的数量
    public static void main(String[] args) {
        // 实现一个Runnable接口
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (restCount > 0) {
                    // 这里要写的就是锁，可以是对象锁，也可以是类锁
                    soldTicket();
                }
            }
        };
        // 通过这个 runnable 实例化四个线程
        Thread t0 = new Thread(runnable, "彭于晏");
        Thread t1 = new Thread(runnable, "周杰伦");
        Thread t2 = new Thread(runnable, "林俊杰");
        Thread t3 = new Thread(runnable, "古力娜扎");

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }

    // 卖票的方法:
    // 如果一个方法中，所有的逻辑都需要被同步，放入到一个同步代码段中
    // 可以把这个方法，做成同步方法。
    private static synchronized void soldTicket() {
        if (restCount > 0) {
            System.out.println("售票员: " + Thread.currentThread().getName() + " 卖出了一张票，剩余: " + --restCount);
        }
    }
}
