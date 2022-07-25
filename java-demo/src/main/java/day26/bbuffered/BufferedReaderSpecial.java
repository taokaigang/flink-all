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
public class BufferedReaderSpecial {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file\\day26\\src"))) {
            // 1. 定义一个字符串，用来接收每一行读取到的数据
            String line = "";
            // 2. 循环读取数据
            while ((line = reader.readLine()) != null) {
                // 3. 将读取到的数据输出
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
