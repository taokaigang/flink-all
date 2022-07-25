package day25.bio;

import java.io.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description 常见的IO流的创建的方式
 */
public class IO2 {
    public static void main(String[] args) {
        /**
         * try结构的特殊语法: try ()
         * 将 AutoClosable 接口的实现类对象的实例化放到小括号中。
         * 此时，在离开了try结构的时候，会自动的对这个类进行close方法的调用
         */
        try (InputStream inputStream = new FileInputStream("file\\day25\\source")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(new File("file\\day25\\source").delete());
    }
}
