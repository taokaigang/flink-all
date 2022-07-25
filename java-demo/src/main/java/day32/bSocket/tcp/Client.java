package day32.bSocket.tcp;

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
public class Client {
    public static void main(String[] args) {
        // 1. 实例化一个 Socket 类的对象
        try (Socket client = new Socket(InetAddress.getLocalHost(), 9876)) {
            // 2. 实例化一个Scanner对象
            Scanner scanner = new Scanner(System.in);
            // 3. 获取本机到网络输出流
            OutputStream outputStream = client.getOutputStream();
            Scanner serverScanner = new Scanner(client.getInputStream());
            // 4. 读取内容，输出到服务端
            while (true) {
                String line = scanner.nextLine();
                outputStream.write((line + "\n").getBytes());
                outputStream.flush();

                // 4.5. 读取服务端返回的数据
                String msg = serverScanner.nextLine();
                System.out.println("服务端的回复: " + msg);

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
