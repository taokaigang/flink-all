package day25.bio.aByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description 使用字节流进行数据的读取
 */
public class InputStreamTest {
    public static void main(String[] args) {
        // 1. 建立程序与文件之间的连接，用来读取这个文件
        try (InputStream inputStream = new FileInputStream("file\\day25\\src")) {
            // 2. 读取字节流中的数据，需要有一个字节数组，用来读取数据
            //    这个数组长度，不用和文件一样大小，找一个大小合适的数组读取即可
            byte[] array = new byte[32];
            // 3. 声明一个整型变量，用来记录每次读取了多少个字节的数据
            int length = 0;
            // 3. 循环读取数据
            while ((length = inputStream.read(array)) != -1) {
                // 将读取到的字节数组中的数据，转成字符串输出
                // 为了去除最后一次进行读取数据的时候，上次读取残留的问题
                // 最后一次读取的数据，只有指定部分是我们需要的数据
                String str = new String(array, 0, length);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
