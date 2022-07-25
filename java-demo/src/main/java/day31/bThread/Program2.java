package day31.bThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description 线程池工具类
 */
public class Program2 {
    public static void main(String[] args) {
        /*
            corePoolSize: 0
            maximumPoolSize: Integer.MAX_VALUE
         */
        ExecutorService service = Executors.newCachedThreadPool();

        /*
            corePoolSize: nThreads
            maximumPoolSize: nThreads
         */
        ExecutorService service1 = Executors.newFixedThreadPool(5);



    }
}
