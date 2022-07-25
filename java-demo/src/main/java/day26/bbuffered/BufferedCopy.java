package day26.bbuffered;

import java.io.*;

/**
 * @Description 使用缓冲字符流实现文本文件的拷贝
 */
public class BufferedCopy {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file\\day26\\src"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("file\\day26\\destination"))) {
            //
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
