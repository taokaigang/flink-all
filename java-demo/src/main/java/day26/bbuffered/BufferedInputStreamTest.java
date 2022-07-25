package day26.bbuffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description BufferedInputStream使用
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) {
        // 过程和InputStream一模一样的
        // 缓冲字节输入流流是需要基于一个字节输入流来进行实例化的
        // 在这里，BufferedInputStream构造方法中的InputStream对象，只是用来做当前的对象的实例化，在使用结束的时候，理论上来讲，是需要关闭的
        // 实际在使用中，使用结束后，只需要关闭BufferedInputStream即可。
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("file\\day26\\source"))) {
            // 1. 实例化一个字节数组
            byte[] array = new byte[1024];
            // 2. 声明一个整型变量，用来记录每次读取了多少个字节数据
            int length = 0;
            // 3. 循环读取
            while ((length = bufferedInputStream.read(array)) != -1) {
                // 4. 将读取到的数据转成字符串输出到控制台
                String msg = new String(array, 0, length);
                System.out.println(msg);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
