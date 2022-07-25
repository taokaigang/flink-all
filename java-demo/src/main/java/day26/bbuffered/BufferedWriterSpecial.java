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
public class BufferedWriterSpecial {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file\\day26\\dst"))) {
            bufferedWriter.write("hello world");
            bufferedWriter.newLine();
            bufferedWriter.write("你好，世界");
            bufferedWriter.newLine();
            bufferedWriter.write("end");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
