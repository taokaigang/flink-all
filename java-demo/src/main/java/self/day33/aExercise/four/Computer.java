package self.day33.aExercise.four;

public class Computer {
    private USB usb1;
    public void setUsb1(USB usb1) {
        this.usb1 = usb1;
    }

    /**
     * 展示自己连接的各种外设设备的信息
     */
    public void showDeviceInfo() {
        System.out.println("USB1端口连接了: " + this.usb1.getUSBDeviceInfo());
    }
}
