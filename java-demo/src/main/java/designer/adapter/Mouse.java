package designer.adapter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 鼠标类，是一个USB接口的实现类，可以直接通过USB接口连接到电脑上
 */
public class Mouse implements USB {
    @Override
    public String getUSBDeviceInfo() {
        return "鼠标";
    }
}
