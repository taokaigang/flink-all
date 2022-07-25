package day10.binheritance.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Dog对象
        Dog dog = new Dog();
        // 2. 访问Dog类中的成员
        dog.name = "哈士奇";
        dog.age = 2;
        dog.gender = '男';
        dog.furColor = "Black";

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
