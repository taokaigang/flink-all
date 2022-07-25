package self.day29.aExercise.four;

public class Four {
    /**
     * 4. 创建两个线程模拟下载数据，第一个线程负责下载10张图片，第二个线程负责下载20条数据，分别休眠20毫秒和10毫秒。观察打印情况。（模拟下载，输出即可）
     * @param args
     */
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"正在下载第"+(i+1)+"张图片");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t1");

        Thread t2=new Thread(()-> {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"正在下载第"+(i+1)+"条数据");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        },"t2");

        t1.start();
        t2.start();
    }
}
