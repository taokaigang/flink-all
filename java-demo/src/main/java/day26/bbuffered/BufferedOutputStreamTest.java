package day26.bbuffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description BufferedOutputStream
 */
public class BufferedOutputStreamTest {
    public static void main(String[] args) {
        // 1. 实例化一个缓冲字节输出流对象
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("file\\day26\\target")))  {
            // 2. 将数据写入到输出流中
            bufferedOutputStream.write("hello world".getBytes());
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
