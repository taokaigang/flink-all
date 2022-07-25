package day11.dAbstract;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description  快递
 */
public abstract class Express {
    // 制定一个规则，要求所有的子类都必须实现。
    public abstract void sendPackage();
}

class Shunfeng extends Express {
    @Override
    public void sendPackage() {
        System.out.println("顺丰快递发包裹");
    }
}

class Yuantong extends Express {
    @Override
    public void sendPackage() {
        System.out.println("圆通快递发包裹");
    }
}