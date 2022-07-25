package designer.proxy.staticProxy;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化三个购买方
        Buyer xiaoming = new Buyer("小明");
        Buyer xiaomei = new Buyer("小美");
        Buyer xiaojuan = new Buyer("小娟");

        // 2. 实例化一个代购方
        Proxy proxy = new Proxy("老王", xiaoming, xiaomei, xiaojuan);

        // 3. 让代理方购买即可
        proxy.buyMac("MacBook Pro");
    }
}
