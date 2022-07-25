package designer.proxy.dynamicProxy;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public abstract class Buyer {
    protected String name;   // 实际购买者的名字
}

interface Buy {
    // 购买者的购买行为
    public abstract void buy();
}

// 购买者的需求是不一样的！
class MacBuyer extends Buyer implements Buy {
    public MacBuyer(String name) {
        this.name = name;
    }

    @Override
    public void buy() {
        System.out.println(this.name + "得到了一个 MacBook Pro");
    }
}

class PhoneBuyer extends Buyer  implements Buy {
    public PhoneBuyer(String name) {
        this.name = name;
    }

    @Override
    public void buy() {
        System.out.println(this.name + "得到了一个 iPhone 12 Pro Max");
    }
}

class PadBuyer extends Buyer implements Buy {
    public PadBuyer(String name) {
        this.name = name;
    }

    @Override
    public void buy() {
        System.out.println(this.name + "得到了一个 iPad Pro");
    }
}



