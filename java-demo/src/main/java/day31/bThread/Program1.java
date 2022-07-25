package day31.bThread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description
 */
public class Program1 {
    public static void main(String[] args) {
        // 1. 实例化一个线程池对象
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
                10,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(5),
                new ThreadPoolExecutor.CallerRunsPolicy());

        // 2. 将任务提交给线程池，由线程池来分配线程处理任务
        for (int i = 0; i < 16; i++) {
            // executor.submit(new MyTask(i));
            // executor.execute(new MyTask(i));
        }

        // 3. 停止线程池
        //    告诉线程池一个停止信号，当线程池中现有的所有的任务都执行结束了，会停止当前的线程池。
        // executor.shutdown();    // 停止
        //    立即停止一个线程池，尝试强行停止线程池中的所有的线程。
        executor.shutdownNow();
    }

    private static class MyTask implements Runnable {
        // 任务的id
        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("任务" + taskId + "开始在" + Thread.currentThread().getName() + "线程中执行了");
            try {
                // 休眠，模拟一个任务正在处理中...
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务" + taskId + "已经执行结束了");
        }
    }

}
