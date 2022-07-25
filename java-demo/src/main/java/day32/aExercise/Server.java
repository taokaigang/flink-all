package day32.aExercise;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description 服务端
 *      一个服务端对应多个客户端, 逻辑：每当有一个客户端连接上来，开启一个新的线程，处理这个新的客户端的逻辑。
 */
public class Server {
    public static void main(String[] args) {
        // 准备工作：准备一个线程池
        ExecutorService service = Executors.newCachedThreadPool();

        // 1. 实例化一个ServerSocket对象
        try (ServerSocket serverSocket = new ServerSocket(9876)) {
            // 2. 监听连接到的客户端
            while (true) {
                // 3. 等待连接上来的客户端对象
                // 4. 将连接上来的客户端对象放入线程池中处理逻辑
                service.submit(new SocketTask(serverSocket.accept()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 每一个客户端需要处理的逻辑，将这些客户端放入线程池中，由线程池分配线程并发处理多个客户端的任务
     */
    private static class SocketTask implements Runnable {
        private Socket socket;      // 需要处理的客户端的任务
        public SocketTask(Socket socket) {
            this.socket = socket;
        }
        @Override
        public void run() {
            // 1. 获取一下客户端的信息
            String ipAddr = socket.getInetAddress().getHostAddress();   // 获取IP地址
            int port = socket.getPort();                                // 获取端口号
            // 2. 读取客户端发送过来的消息
            try {
                // 2.1. 实例化一个Scanner对象，用来读取从网络中传递过来的数据
                Scanner scanner = new Scanner(socket.getInputStream());
                while (true) {
                    // 2.2. 读取一行数据
                    String line = scanner.nextLine();
                    // 2.3. 输出结果
                    System.out.printf("客户端[%s:%d]对您说: %s\n", ipAddr, port, line);
                    // 2.4. 结束条件
                    if (line.matches("88|886|bye")) {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
