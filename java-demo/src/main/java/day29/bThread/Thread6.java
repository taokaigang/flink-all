package day29.bThread;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 线程优先级的设置
 */
public class Thread6 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        Thread t0 = new Thread(runnable, "t0");
        Thread t1 = new Thread(runnable, "t1");
        // 设置线程的优先级：一定要在线程启动之前
        t0.setPriority(10);
        t1.setPriority(1);

        t0.start();
        t1.start();
    }
}
