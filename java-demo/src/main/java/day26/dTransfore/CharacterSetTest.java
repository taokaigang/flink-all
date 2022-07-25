package day26.dTransfore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description
 */
public class CharacterSetTest {
    public static void main(String[] args) {
        // 乱码展示：原因就是因为读取的文件和当前项目默认的字符集不相同
        try (BufferedReader reader = new BufferedReader(new FileReader("file\\day26\\src"))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
