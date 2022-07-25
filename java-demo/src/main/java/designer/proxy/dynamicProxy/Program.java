package designer.proxy.dynamicProxy;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 小明需要购买电脑
        MacBuyer xiaoming = new MacBuyer("xiaoming");
        // 小美需要购买手机
        PhoneBuyer xiaomei = new PhoneBuyer("xiaomei");
        // 小娟需要购买pad
        PadBuyer xiaojuan = new PadBuyer("xiaojuan");

        // 实例化动态代理类对象
        DynamicProxy proxy = new DynamicProxy();

        // 让代购购买
        ((Buy)proxy.getProxy(xiaoming)).buy();
        ((Buy)proxy.getProxy(xiaomei)).buy();
        ((Buy)proxy.getProxy(xiaojuan)).buy();
    }
}
