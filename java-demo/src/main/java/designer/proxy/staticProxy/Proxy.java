package designer.proxy.staticProxy;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 代理方
 */
public class Proxy implements BuyMac {
    private String name;    // 代购的名字
    private Buyer[] buyers; // 所有的代购的人
    public Proxy(String name, Buyer... buyers) {
        this.name = name;
        this.buyers = buyers;
    }

    @Override
    public void buyMac(String type) {
        System.out.println(this.name + "走进了AppleStore");
        // 代购的过程
        for (Buyer buyer : buyers) {
            buyer.buyMac(type);
        }
        System.out.println(this.name + "走出了AppleStore");
    }
}
