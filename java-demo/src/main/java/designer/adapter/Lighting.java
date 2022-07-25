package designer.adapter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 手机支持的接口，与USB不同
 */
public interface Lighting {
    // 获取一个设备的信息，汇报给适配器
    String getLightingDeviceInfo();
}
