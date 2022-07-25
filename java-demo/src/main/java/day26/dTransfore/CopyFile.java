package day26.dTransfore;

import java.io.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description
 */
public class CopyFile {
    // 需求：将一个GBK字符集中的数据拷贝到一个UTF-8的文件中。
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("file\\day26\\src"), "GBK"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("file\\day26\\destination")))) {
            // 循环读写数据
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
