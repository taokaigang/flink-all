package designer.factory.facoryMethod;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        HuaweiPhone huaweiPhone = new HuaweiFactory().getPhone();
        ApplePhone applePhone = new AppleFactory().getPhone();
        XiaomiPhone xiaomiPhone = new XiaomiFactory().getPhone();
        SamsungPhone samsungPhone = new SamsungFactory().getPhone();
    }
}
