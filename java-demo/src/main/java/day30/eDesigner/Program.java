package day30.eDesigner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/30
 * @Description
 *      需求:
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个橱柜
        Box box = new Box();

        // 2. 实例化两个个生产者
        Productor productorA = new Productor("谢小厨", 100, box);
        Productor productorB = new Productor("黄小厨", 130, box);

        // 3. 实例化两个消费者
        Consumer consumerA = new Consumer("李雷", 1000, box);
        Consumer consumerB = new Consumer("韩梅梅", 1200, box);

        productorA.start();
        productorB.start();
        consumerA.start();
        consumerB.start();
    }
}
