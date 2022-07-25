package designer.adapter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 手机，是一个Lighting接口的实现类
 */
public class Phone implements Lighting {
    @Override
    public String getLightingDeviceInfo() {
        return "iPhone 12 Pro Max";
    }
}
