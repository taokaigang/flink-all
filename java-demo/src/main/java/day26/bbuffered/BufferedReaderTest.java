package day26.bbuffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        // 借助一个字符流，实例化一个缓冲字符输入流
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file\\day26\\src"))) {
            // 从流中读取数据
            char[] array = new char[100];
            int length = 0;
            while ((length = bufferedReader.read(array)) != -1) {
                System.out.print(new String(array, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
