package day30.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description
 */
public class Program {
    public static void main(String[] args) {

    }

    private static void method1() {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };
        // 实例化线程对象
        Thread thread = new Thread(runnable, "接口实例化的线程");
        // 启动线程
        thread.start();
    }

    private static void method2() {
        MyThread thread = new MyThread();
        thread.start();
    }

    private static class MyThread extends Thread {
        public MyThread() {}

        // 可以在实例化线程对象的同时，设置线程的名字
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName() + " : " + i);
            }
        }
    }
}
