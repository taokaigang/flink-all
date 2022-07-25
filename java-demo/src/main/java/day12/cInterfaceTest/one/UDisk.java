package day12.cInterfaceTest.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class UDisk implements USB {
    @Override
    public String getDeviceInfo() {
        return "一个U盘";
    }
}
