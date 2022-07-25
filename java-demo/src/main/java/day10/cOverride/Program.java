package day10.cOverride;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Animal对象，调用bark方法
        Animal animal = new Animal();
        animal.bark();          // Animal Bark~

        // 2. 实例化一个Dog对象，调用bark方法
        Dog dog = new Dog();
        dog.bark();             // Won~

        new Cat().bark();       // Meow~
        new Rabbit().bark();    // Animal Bark~
    }
}
