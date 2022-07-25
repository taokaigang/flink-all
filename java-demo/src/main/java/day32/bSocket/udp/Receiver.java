package day32.bSocket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description 数据接收方
 */
public class Receiver {
    public static void main(String[] args) {
        // 1. 实例化一个 DatagramSocket 对象
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            // 2. 准备一个长数组
            byte[] array = new byte[1024];
            // 3. 准备一个 DatagramPacket 对象
            DatagramPacket packet = new DatagramPacket(array, array.length);
            // 4. 接收数据报包，这一步操作会阻塞线程，一直到接收到数据报包为止。
            socket.receive(packet);
            // 5. 解数据
            byte[] data = packet.getData();             // 数据报包中的数据，等同于上方的array
            int length = packet.getLength();            // 数据报包中的数据长度
            InetAddress address = packet.getAddress();  // 获取发送方的设备信息
            int port = packet.getPort();                // 端口信息
            System.out.printf("[%s:%d]对您说: %s\n", address.getHostAddress(), port, new String(data, 0, length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
