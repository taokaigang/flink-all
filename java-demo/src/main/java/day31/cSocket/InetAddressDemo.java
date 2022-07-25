package day31.cSocket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            // 1. 获取本机
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            // 2. 通过主机的名字，获取一个主机
            //InetAddress host1 = InetAddress.getByName("shwn");
            //System.out.println(host1);
            // 3. 通过一个IP地址字符串，获取一个主机
            InetAddress host2 = InetAddress.getByName("192.168.10.3");
            System.out.println(host2);
            // 4. 通过一个域名获取主机
            InetAddress host3 = InetAddress.getByName("www.taobao.com");
            System.out.println(host3);
            // 5. 通过一个域名获取所有的主机
            InetAddress[] hosts = InetAddress.getAllByName("www.taobao.com");
            for (InetAddress host : hosts) {
                System.out.println(host);
            }

            // 6. 通过一个IP地址，获取到一个主机。IP地址存入到一个byte数组中表示。
            InetAddress host4 = InetAddress.getByAddress(new byte[]{(byte)192, (byte)168, 10, 3});
            System.out.println(host4);

            // 7. 通过一个主机，获取主机名字
            System.out.println(localHost.getHostName());
            // 8. 通过一个主机，获取IP地址（字符串）
            System.out.println(localHost.getHostAddress());
            // 9. 通过一个主机，获取一个IP地址的字节数组
            byte[] address = localHost.getAddress();
            System.out.println(Arrays.toString(address));

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
