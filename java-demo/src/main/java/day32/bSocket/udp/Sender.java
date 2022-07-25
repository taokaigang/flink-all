package day32.bSocket.udp;


import java.io.IOException;
import java.net.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description 发送方
 *      在UDP中，没有所有的“客户端”和“服务端”，所有的角色都由 DatagramSocket 来描述的。
 */
public class Sender {
    public static void main(String[] args) {
        // 1. 实例化一个 DatagramSocket 对象
        //    在实例化的时候，也不需要接收方的IP、端口号。因为这些信息都会被封装到数据报包中。
        try (DatagramSocket socket = new DatagramSocket()) {
            // 2. 准备要发送给接收方的数据
            byte[] array = "hello world".getBytes();
            // 3. 准备一个InetAddress对象，用来存储接收方的设备信息
            InetAddress receiver = InetAddress.getLocalHost();
            // 4. 封装数据报包
            DatagramPacket packet = new DatagramPacket(array, array.length, receiver, 9876);
            // 5. 直接把这个数据报包发送出去即可
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
