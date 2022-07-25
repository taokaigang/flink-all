package day11.dAbstract;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化Animal的对象
        // Animal animal = new Animal();

        // 2. 抽象类，虽然不能实例化对象，但是却是可以声明引用的。
        //    抽象类的引用，可以指向子类的对象。（向上转型）
        Animal animal = new Dog();
    }
}
