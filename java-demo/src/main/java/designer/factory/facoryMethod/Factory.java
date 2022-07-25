package designer.factory.facoryMethod;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 *      为了解决简单工厂中的开闭原则问题，将简单工厂进行拆分，拆分成若干子工厂
 *      每一个工厂各司其职，负责自己的产品线的生产
 */
public abstract class Factory {
    // 定义了所有的工厂中，用来获取手机的方法
    // 将所有的工厂的方法进行了约束、统一
    public abstract Phone getPhone();
}

class AppleFactory extends Factory {
    @Override
    public ApplePhone getPhone() {
        return new ApplePhone();
    }
}

class HuaweiFactory extends Factory {
    @Override
    public HuaweiPhone getPhone() {
        return new HuaweiPhone();
    }
}

class XiaomiFactory extends Factory {
    @Override
    public XiaomiPhone getPhone() {
        return new XiaomiPhone();
    }
}

class SamsungFactory extends Factory {
    @Override
    public SamsungPhone getPhone() {
        return new SamsungPhone();
    }
}

class HTCFactory extends Factory {
    @Override
    public HTCPhone getPhone() {
        return new HTCPhone();
    }
}

