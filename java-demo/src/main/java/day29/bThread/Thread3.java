package day29.bThread;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 线程的并发执行
 */
public class Thread3 {
    public static void main(String[] args) {
        // 1. 实例化一个Runnable接口实现类对象
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        // 2. 实例化两个线程
        Thread t0 = new Thread(runnable, "t0");
        Thread t1 = new Thread(runnable, "t1");

        // 3. 启动线程
        t0.start();
        t1.start();
    }
}
