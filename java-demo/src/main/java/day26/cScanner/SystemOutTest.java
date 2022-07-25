package day26.cScanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description 标准输出流
 */
public class SystemOutTest {
    public static void main(String[] args) {
        PrintStream original = System.out;
        // PrintStream: 是一个打印流，可以将数据输出到指定位置。
        try (PrintStream ps = new PrintStream(new FileOutputStream("file\\day26\\logs", true))) {
            // ps.println("hello world！");
            // 重定向标准输出流
            System.setOut(ps);

            System.out.println("123");
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.setOut(original);
        }

        System.out.println("你好");

        // System.out;      标准输出流地址
        // System.out -> ps
    }
}
