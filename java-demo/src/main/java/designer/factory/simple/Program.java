package designer.factory.simple;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Program {
    // 小明需要购买一部手机，根据不同的需求，获取到不同的手机对象
    public static void main(String[] args) {

        Phone apple = PhoneFactory.getPhone("apple");
        Phone huawei = PhoneFactory.getPhone("huawei");
        Phone xiaomi = PhoneFactory.getPhone("xiaomi");
    }
}
