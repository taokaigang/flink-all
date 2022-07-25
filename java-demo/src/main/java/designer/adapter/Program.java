package designer.adapter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 设计电脑
        Computer computer = new Computer();
        // 实例化外设设备
        Mouse mouse = new Mouse();
        Phone phone = new Phone();

        // 连接设备
        computer.setUsb1(mouse);                // 鼠标是USB设备，可以直接连接到电脑上
        computer.setUsb2(new Adapter(phone));   // 手机是Lighting设备，需要由适配器完成辅助连接

        // 展示设备的信息
        computer.showDeviceInfo();
    }
}
