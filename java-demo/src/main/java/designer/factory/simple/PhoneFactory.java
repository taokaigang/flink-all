package designer.factory.simple;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 手机制造类
 *      其实，这个类，就是一个手机工厂类。
 *      将手机的各个子类对象的实例化封装起来，提供给外界一个通过指定的条件，获取不同手机对象的方法。
 *      这样的设计模式，就是简单工厂设计模式。
 */
public class PhoneFactory {
    /**
     * 根据用户的不同的需求，返回给用户不同的手机对象
     * @param choice 用户的需求
     * @return 根据用户的需求，实例化的对象
     */
    public static Phone getPhone(String choice) {
        if (choice.equalsIgnoreCase("apple")) {
            return new ApplePhone();
        }
        else if (choice.equalsIgnoreCase("huawei")) {
            return new HuaweiPhone();
        }
        else if (choice.equalsIgnoreCase("xiaomi")) {
            return new XiaomiPhone();
        }
        else if (choice.equalsIgnoreCase("samsung")) {
            return new SamsungPhone();
        }
        return null;
    }
}
