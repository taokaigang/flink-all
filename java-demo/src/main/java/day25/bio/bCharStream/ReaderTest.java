package day25.bio.bCharStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description 字符输入流读取数据
 */
public class ReaderTest {
    public static void main(String[] args) {
        // 读取过程与字节输入流完全相同，只需要将使用到的类换一下即可。
        try (Reader reader = new FileReader("file\\day25\\src")) {
            // 1. 实例化一个字符数组
            char[] array = new char[100];
            // 2. 声明一个变量，用来记录每次读取到了多少个数据
            int length = 0;
            // 3. 循环读取数据
            while ((length = reader.read(array)) != -1) {
                String str = new String(array, 0, length);
                System.out.print(str);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
