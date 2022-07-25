package day25.bio.aByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description 字节输出流，写文件
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        // 1. 实例化一个管道，连接文件和程序。
        //    对于FileOutputStream来说，如果目标文件不存在，则会自动的创建。
        //    当无法创建这个文件的时候(父级目录不存在)，创建会失败，会触发 FileNotFoundException 。
        try (OutputStream outputStream = new FileOutputStream("file\\day25\\dst", true)) {
            // 2. 准备需要写入到这个文件中的数据
            String message = "你好，师姐";
            // 3. 将数据写入到输出流中，由输出流写入到文件中
            outputStream.write(message.getBytes());

            // 冲刷缓冲区，将缓冲区中的数据强制流动到文件中。
            // 在流关闭的时候，会自动的调用。
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
