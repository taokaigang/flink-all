package day31.aExercise;

import java.util.Random;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description
 *      有五个人同时过一个独木桥，一个独木桥同时只能允许一个人通过。
 *      每一个人通过独木桥的时间是随机在 [5,10] 秒，输出这个独木桥上每一个人的通过详情，
 *      例如：
 *      张三开始过独木桥了...
 *      张三通过独木桥了!
 */
public class Two {
    public static void main(String[] args) {
        // 1. 实例化一个随机数对象
        Random random = new Random();
        // 2. 实例化一个Runnable接口实现类对象
        Runnable runnable = () -> {
            // 3. 操作临界资源，先上锁
            synchronized ("") {
                System.out.println(Thread.currentThread().getName() + " 开始过桥了...");
                // 线程休眠，模拟某一个人正在通过桥
                try {
                    Thread.sleep((random.nextInt(6) + 5) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 已经通过桥了");
            }
        };

        // 4. 实例化线程对象
        Thread thread1 = new Thread(runnable, "张三");
        Thread thread2 = new Thread(runnable, "李四");
        Thread thread3 = new Thread(runnable, "王五");
        Thread thread4 = new Thread(runnable, "赵六");
        Thread thread5 = new Thread(runnable, "韩梅梅");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
