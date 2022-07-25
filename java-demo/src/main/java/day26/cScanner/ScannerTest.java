package day26.cScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description Scanner类的方法
 */
public class ScannerTest {
    public static void main(String[] args) {
        // 其实，Scanner在使用结束之后，也是需要进行关闭的。 调用close方法。
        try (Scanner scanner = new Scanner(new File("file\\day26\\src"))) {
            // 读取文件中的内容
            while (scanner.hasNextLine()) {
                System.out.println(scanner.hasNextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
