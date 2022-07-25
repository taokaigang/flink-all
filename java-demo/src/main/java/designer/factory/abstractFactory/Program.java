package designer.factory.abstractFactory;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 需要购买小米的平板
        XiaomiPad pad = new XiaomiFactory().getPad();
        // 需要购买苹果的电脑
        AppleComputer computer = new AppleFactory().getComputer();
    }
}
