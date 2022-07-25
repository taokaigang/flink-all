package day26.bbuffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description
 */
public class BufferedWriterTest {
    public static void main(String[] args) {
        // 借助一个字符输出流，实例化一个缓冲字符输出流对象
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file\\day26\\dst"))) {
            bufferedWriter.write("hello world");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
