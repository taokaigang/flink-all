package day26.cScanner;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description 标准输入流
 */
public class SystemInTest {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(System.in)) {
            byte[] array = new byte[128];
            int length = 0;
            while ((length = bis.read(array)) != -1) {
                String str = new String(array, 0, length);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
