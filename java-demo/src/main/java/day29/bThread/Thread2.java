package day29.bThread;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 线程的名字设置
 */
public class Thread2 {
    public static void main(String[] args) {
        // 1. 实例化一个线程子类对象
        MyThread thread = new MyThread("MyThirdThread");
        // 2. 获取线程的名字
        System.out.println(thread.getName());
        // 3. 启动线程
        thread.start();
    }

    // 通过构造方法
    private static void setName2() {
        // 在实例化一个线程对象的同时，设置线程的名字。
        Thread thread = new Thread(() -> {
            System.out.println("这是子线程中的逻辑");
        }, "MySecondThread");
        // 获取线程名字
        System.out.println(thread.getName());
    }

    // 通过 setName 方法进行名字的设置
    private static void setName1() {
        // 1. 实例化一个线程对象
        Thread thread = new Thread(() -> {
            System.out.println("这是一个子线程中的逻辑");
        });

        // 2. 设置线程名字
        thread.setName("MyFirstThread");
        // 3. 获取线程的名字
        System.out.println(thread.getName());
    }
}
