package day29.bThread;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 线程合并
 */
public class Thread5 {
    // 场景模拟:
    // 某一个景点有一个售票窗口，共有100张票。
    // 这个窗口前原来是有散客在买票，当卖出30张票的时候，插队进来了50个VIP。
    // 窗口需要优先处理这50个VIP客户的票。此时，剩余的散客就得等待。
    private static int ticketCount = 100;   // 票的数量

    public static void main(String[] args) {
        // VIP要处理的逻辑
        Runnable vipRunnable = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("窗口卖给VIP客户一张票，余票: " + --ticketCount);
            }
        };
        // VIP线程
        Thread vipThread = new Thread(vipRunnable);

        // 散客要处理的逻辑
        Runnable runnable = () -> {
            while (ticketCount > 0) {
                // 票的数量-1
                System.out.println("窗口卖给散客一张票，余票: " + --ticketCount);
                // 卖出30张票的时候
                if (ticketCount == 70) {
                    // VIP线程合并进来
                    vipThread.start();
                    try {
                        // 当VIP线程合并进来后，原来的散客线程中的逻辑都得阻塞。
                        vipThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // 散客线程
        Thread thread = new Thread(runnable);

        thread.start();
    }
}
