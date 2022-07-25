package day31.cSocket.tcp3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description 循环接收客户端发送过来的消息
 */
public class Server {
    public static void main(String[] args) {
        // 1. 获取一个线程池
        ExecutorService service = Executors.newCachedThreadPool();

        // 2. 实例化一个服务端对象
        try (ServerSocket serverSocket = new ServerSocket(9988)) {
            while (true) {
                // 1. 监听每一个连接上来的客户端
                Socket accept = serverSocket.accept();
                // 2. 开启一个新的线程，处理这个客户端的任务
                service.submit(new SocketTask(accept));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class SocketTask implements Runnable {

        private Socket socket;
        public SocketTask(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            System.out.printf("客户端【%s】对您说: \n", socket.getInetAddress().getHostAddress());
            // 读取客户端发送过来的消息
            Scanner scanner = null;
            try {
                scanner = new Scanner(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (true) {
                String msg = scanner.nextLine();
                System.out.println(msg);
                if (msg.matches("88|886|Bye|bye")) {
                    break;
                }
            }
        }
    }
}
