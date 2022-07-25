package day12.cInterfaceTest.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      1. 提供电脑和外设设备连接的规范。
 *      2. 提供方法，获取外设设备的信息。
 */
public interface USB {
    // 获取外设设备的信息
    String getDeviceInfo();
}
