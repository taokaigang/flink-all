package designer.proxy.staticProxy;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 实际购买者，被代理方
 */
public class Buyer implements BuyMac {
    private String name;
    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void buyMac(String type) {
        System.out.println(this.name + "得到了一台" + type);
    }
}
