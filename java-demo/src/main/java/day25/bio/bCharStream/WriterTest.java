package day25.bio.bCharStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description 使用字符流写数据
 */
public class WriterTest {
    public static void main(String[] args) {
        // 1. 实例化相关的类
        try (Writer writer = new FileWriter("file\\day25\\target", true)) {
            // 2. 将数据写入到输出流中
            writer.write("hello, world");
            // 3. 冲刷缓冲区
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
