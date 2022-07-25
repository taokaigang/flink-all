package designer.adapter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description USB接口，提供了连接到电脑的设备的统一规范
 */
public interface USB {
    // 获取一个USB设备的描述信息，汇报给电脑
    String getUSBDeviceInfo();
}
