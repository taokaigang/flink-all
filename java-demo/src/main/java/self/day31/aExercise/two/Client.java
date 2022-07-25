package self.day31.aExercise.two;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description 需求：实现客户端单向向服务端发送数据，所有的数据都在控制台输入
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9988)) {
            // 获取由本机到网络的输出流
            OutputStream outputStream = socket.getOutputStream();
            // 将要发送的数据发送给服务端
            while (true) {
                // 读取控制台的一行数据
                String line = scanner.nextLine();
                outputStream.write((line + "\n").getBytes());
                outputStream.flush();
                // 终止条件
                if (line.matches("88|886|Bye|bye")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
