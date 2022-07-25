package day12.cInterfaceTest.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *
 *      很多的外设设备，都需要连接到电脑上。电脑类在设计的时候，不需要针对每一个外设设备区分对待。
 *      只需要使用一个统一的规范，完成设备的连接即可。
 */
public class Computer {
    // 电脑的三个USB端口
    private USB usb1;
    private USB usb2;
    private USB usb3;

    public void setUsb1(USB usb1) {
        this.usb1 = usb1;
    }

    public void setUsb2(USB usb2) {
        this.usb2 = usb2;
    }

    public void setUsb3(USB usb3) {
        this.usb3 = usb3;
    }

    /**
     * 输出每一个USB端口连接到的设备的信息
     */
    public void showDevices() {
        System.out.println("USB1端口连接了: " + this.usb1.getDeviceInfo());
        System.out.println("USB2端口连接了: " + this.usb2.getDeviceInfo());
        System.out.println("USB3端口连接了: " + this.usb3.getDeviceInfo());
    }
}
