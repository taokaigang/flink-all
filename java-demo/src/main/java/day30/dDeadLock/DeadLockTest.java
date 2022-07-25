package day30.dDeadLock;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description 死锁的展示
 */
public class DeadLockTest {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            synchronized ("a") {
                System.out.println("A线程持有了a锁，等待b锁");
                try {
                    Thread.sleep(100);

                    // 让当前线程释放自己持有的 "a" 锁
                    // 进入到等待队列
                    "a".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized ("b") {
                    System.out.println("A线程同时持有了a锁和b锁");
                }
            }
        };

        Runnable runnableB = () -> {
            synchronized ("b") {
                System.out.println("B线程持有了b锁，等待a锁");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized ("a") {
                    System.out.println("B线程同时持有了a锁和b锁");
                    // 唤醒等待队列中，一个等待 "a" 锁的线程
                    "a".notify();
                }
            }
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();
    }
}
