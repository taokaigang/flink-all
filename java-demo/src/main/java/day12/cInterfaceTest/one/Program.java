package day12.cInterfaceTest.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      已知电脑有三个USB接⼝，分别去实例化⼀个⿏标，⼀个键盘，⼀个U盘来连接到电脑上。
 *      输出每⼀个USB接⼝连接的设备信息
 *
 *      分析：
 *          1. 需要设计一个USB接口，提供电脑和外设设备连接的规范。
 *          2. 在USB接口中，添加一个可以获取外设设备信息的方法。（通过这个方法，将外设设备的信息上传给电脑）
 *          3. 设计相关的外设设备类（鼠标、键盘、U盘），实现USB接口。
 *          4. 设计电脑类，提供三个USB接口类型的属性，以便外设设备连接。
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化外设设备
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        UDisk uDisk = new UDisk();

        // 2. 实例化一个电脑
        Computer computer = new Computer();

        // 3. 通过USB接口，将外设设备与电脑进行连接
        computer.setUsb1(mouse);
        computer.setUsb2(keyboard);
        computer.setUsb3(uDisk);

        // 4. 输出每一个端口连接的外设设备的信息
        computer.showDevices();
    }
}
