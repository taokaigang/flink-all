package day29.bThread;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description
 */
public class Thread1 {
    public static void main(String[] args) {
        // 1. 实例化一个线程子类对象
        // MyThread thread = new MyThread();

        // 2. 通过Runnable接口进行线程实例化
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("接口实现的线程输: " + i);
                }
            }
        };
        Thread thread = new Thread(runnable);

    }
}
