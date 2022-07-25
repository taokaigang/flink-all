package day31.cSocket.tcp1;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description 服务端
 */
public class Server {
    public static void main(String[] args) {
        // 1. 开启一个服务端，监听某一个端口  ServerSocket(int port)
        try (ServerSocket serverSocket = new ServerSocket(9988)) {
            // 2. 开始监听这个端口传过来的数据（连接上来的客户端）
            //    这个方法会阻塞当前的线程，一直到有客户端连接上来
            Socket socket = serverSocket.accept();
            // 3. 读取客户端发送过来的消息
            // 3.1. 获取客户端的信息
            InetAddress client = socket.getInetAddress();
            // 3.2. 输出日志
            System.out.printf("客户端 %s[%s]对您说: \n", client.getHostName(), client.getHostAddress());
            // 3.3. 读取信息
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
