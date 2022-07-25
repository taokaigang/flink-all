package day29.bThread;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 自定义的线程类
 */
public class MyThread extends Thread {

    public MyThread() {}
    // 希望在实例化线程对象的同时，设置线程的名字
    public MyThread(String name) {
        // 方式1:
        // setName(name);
        // 方式2: 调用父类中的构造方法
        super(name);
    }

    // 重写Thread类的Run方法，在这里，进行线程任务的定制。
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("在子线程中输出: " + i);
        }
    }
}
