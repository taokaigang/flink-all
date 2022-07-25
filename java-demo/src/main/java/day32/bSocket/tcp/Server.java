package day32.bSocket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description 服务端
 */
public class Server {
    public static void main(String[] args) {
        // 1. 实例化ServerSocket对象
        try (ServerSocket serverSocket = new ServerSocket(9876)) {
            // 2. 监听端口，捕获客户端
            Socket socket = serverSocket.accept();
            // 3. 获取客户端的信息
            String ipaddr = socket.getInetAddress().getHostAddress();
            int port = socket.getPort();
            // 4. 读取客户端发送过来的消息
            Scanner scanner = new Scanner(socket.getInputStream());
            //    由服务端将数据写入到网络中的输出流，最终数据会流动到指定的客户端
            OutputStream outputStream = socket.getOutputStream();

            while (true) {
                String msg = scanner.nextLine();
                System.out.printf("客户端[%s:%d]对您说: %s\n", ipaddr, port, msg);
                // 将指定的数据回复给客户端
                // 简单处理逻辑: 将客户端发送过来的消息，转成大写，发送给客户端
                outputStream.write((msg + "\n").toUpperCase().getBytes());
                outputStream.flush();

                if (msg.matches("88|886|bye")) {
                    break;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
