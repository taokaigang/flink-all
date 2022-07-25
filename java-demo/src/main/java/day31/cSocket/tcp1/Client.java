package day31.cSocket.tcp1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 使用 Socket 类，描述客户端程序
        // InetAddress: 表示需要通信的服务端是谁
        // port: 端口号
        // 在这个对象实例化的过程中，已经完成了三次握手！
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9988)) {
            // 能走到这里，说明已经和服务端建立连接了。
            // 将数据发送给服务端。
            // 1. 获取一个输出流，将数据从本地流动到网络中
            OutputStream outputStream = socket.getOutputStream();
            // 2. 将需要发送给服务端的数据，写入到输出流
            outputStream.write("hello".getBytes());
            outputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
