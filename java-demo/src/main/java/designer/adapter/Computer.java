package designer.adapter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 电脑类
 */
public class Computer {
    private USB usb1;
    private USB usb2;

    public void setUsb1(USB usb1) {
        this.usb1 = usb1;
    }

    public void setUsb2(USB usb2) {
        this.usb2 = usb2;
    }

    /**
     * 展示自己连接的各种外设设备的信息
     */
    public void showDeviceInfo() {
        System.out.println("USB1端口连接了: " + this.usb1.getUSBDeviceInfo());
        System.out.println("USB2端口连接了: " + this.usb2.getUSBDeviceInfo());
    }
}
