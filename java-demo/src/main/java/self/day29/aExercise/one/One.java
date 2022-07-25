package self.day29.aExercise.one;

public class One {
    /**
     * 1. 分别用线程子类和Runnable接口开辟一条线程，两个线程中分别输出100次数字。在实例化线程对象的同时，设置线程的名字。
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread=new MyThread("myThread1");

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("接口实现的线程输: " + i);
                }
            }
        };
        Thread thread=new Thread(runnable,"thread2");
    }
}
