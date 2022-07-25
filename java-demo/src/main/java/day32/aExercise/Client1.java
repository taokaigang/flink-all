package day32.aExercise;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description 客户端
 */
public class Client1 {
    public static void main(String[] args) {
        // 1. 实例化一个 Socket 类的对象
        try (Socket client = new Socket(InetAddress.getLocalHost(), 9876)) {
            // 2. 实例化一个Scanner对象
            Scanner scanner = new Scanner(System.in);
            // 3. 获取本机到网络输出流
            OutputStream outputStream = client.getOutputStream();
            // 4. 读取内容，输出到服务端
            while (true) {
                String line = scanner.nextLine();
                outputStream.write((line + "\n").getBytes());
                outputStream.flush();
                // 5. 结束条件
                if (line.matches("88|886|bye")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
