package day31.cSocket.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description 循环接收客户端发送过来的消息
 */
public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9988)) {
            Socket socket = serverSocket.accept();
            System.out.printf("客户端【%s】对您说: \n", socket.getInetAddress().getHostAddress());
            // 读取客户端发送过来的消息
            Scanner scanner = new Scanner(socket.getInputStream());
            while (true) {
                String msg = scanner.nextLine();
                System.out.println(msg);
                if (msg.matches("88|886|Bye|bye")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
