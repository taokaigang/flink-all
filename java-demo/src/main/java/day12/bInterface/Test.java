package day12.bInterface;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      接口多态：
 *          接口的引用，可以指向实现类的对象。
 *          使用接口的引用，调用接口中的方法，最终的实现，是实现类中的重写实现。
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        Runnable runnable = dog;        // 由实现类类型转型为接口类型，是一个向上转型。

        // 成员访问
        dog.breakHouse();   // 可以访问Dog类中独有的成员
        animal.bark();      // 只能访问Animal类中定义的共性的成员
        runnable.run();     // 只能访问Runnable接口中定义的共性的成员
        System.out.println("---------------------------------------------");

        // 向下转型
        // 1. 做一个类型校验，判断能否转型成为指定的类型
        if (runnable instanceof Dog) {
            // 2. 强制类型转换：由接口类型转型为了实现类类型，这个过程，是一个向下转型。
            Dog d = (Dog) runnable;
            d.breakHouse();
            d.bark();
            d.run();
        }
    }
}
