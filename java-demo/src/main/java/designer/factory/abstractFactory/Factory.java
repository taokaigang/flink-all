package designer.factory.abstractFactory;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 工厂类
 */
public abstract class Factory {
    // 在工厂中，提供每一种类型的产品的获取
    public Phone getPhone() {
        return null;
    };
    public Pad getPad() {
        return null;
    };
    public Computer getComputer() {
        return null;
    };
    public TV getTV() {
        return null;
    };
}

class AppleFactory extends Factory {

    @Override
    public ApplePhone getPhone() {
        return new ApplePhone();
    }

    @Override
    public ApplePad getPad() {
        return new ApplePad();
    }

    @Override
    public AppleComputer getComputer() {
        return new AppleComputer();
    }
}

class HuaweiFactory extends Factory {

    @Override
    public HuaweiPhone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public HuaweiPad getPad() {
        return new HuaweiPad();
    }

    @Override
    public HuaweiComputer getComputer() {
        return new HuaweiComputer();
    }
}

class XiaomiFactory extends Factory {

    @Override
    public XiaomiPhone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public XiaomiPad getPad() {
        return new XiaomiPad();
    }

    @Override
    public XiaomiTV getTV() {
        return new XiaomiTV();
    }
}

class SamsungFactory extends Factory {

    @Override
    public SamsungPhone getPhone() {
        return new SamsungPhone();
    }

    @Override
    public SamsungPad getPad() {
        return new SamsungPad();
    }
}