package day31.aExercise;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description
 */
public class One {
    // 被两个线程同时操作的资源（临界资源）
    private static int number = 10;

    public static void main(String[] args) {
        // 实例化两个线程
        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                synchronized ("") {
                    System.out.println(Thread.currentThread().getName() + "对数字进行了加一: " + ++number);
                }
            }
        };

        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                synchronized ("") {
                    System.out.println(Thread.currentThread().getName() + "对数字进行了减一: " + --number);
                }
            }
        };

        Thread thread1 = new Thread(runnable1, "加法线程");
        Thread thread2 = new Thread(runnable2, "减法线程");

        thread1.start();
        thread2.start();

    }
}
