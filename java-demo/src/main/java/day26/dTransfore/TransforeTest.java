package day26.dTransfore;

import java.io.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description 转换流
 *      转换输入流：可以以指定的字符集读取某一个文件中的数据
 *      转换输出流：可以以指定的字符集把数据写入到某一个文件
 */
public class TransforeTest {
    public static void main(String[] args) {
        write();
    }

    private static void write() {
        // 以指定的字符集写数据
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("file\\day26\\dst", true), "GBK")) {
            writer.write("hello world");
            writer.write("你好，世界");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        // 当前的项目是 utf-8, 读取的文件是 GBK
        // 如果需要以指定的字符集进行文件的读取，需要使用 InputStreamReader(InputStream inputStream, String charsetName)
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("file\\day26\\src"), "GBK")) {
            char[] array = new char[128];
            int length = 0;
            while ((length = reader.read(array)) != -1) {
                System.out.println(new String(array, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

