package day30.aExercise;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 面试题: 问最后这个线程启动后，输出的结果时候什么
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable run");
            }
        }) {
            @Override
            public void run() {
                System.out.println("sub run");
            }
        }.start();
    }

    // A: runnable run
    // B: sub run
}
