package designer.decoration.example;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 *      设计案例: 完成对一个人的装饰。
 *      一个人，可以由裤子、鞋、上衣等进行装饰。
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个人
        Person xiaoming = new Person();
        // 2. 添加装饰
        // Decorator decorator = new TshirtDecorator(xiaoming);
        // decorator = new ShoesDecorator(decorator);
        // decorator = new TrousersDecorator(decorator);

        // Decorator decorator = new TshirtDecorator(new TrousersDecorator(new ShoesDecorator(xiaoming)));
        Decorator decorator = new ShoesDecorator(new TrousersDecorator(new TshirtDecorator(xiaoming)));

        decorator.show();
    }
}
