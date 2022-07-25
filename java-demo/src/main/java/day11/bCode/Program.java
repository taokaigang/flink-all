package day11.bCode;


import day3.bOperator.D;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 *
 *      向上转型：
 *          1. 向上转型，是一个自动类型转换。直接赋值即可，不需要任何额外的操作。是一个隐式转换。
 *          2. 向上转型，一定会成功，没有失败的可能性。
 *          3. 向上转型后的父类引用，只能够访问到父类中定义的成员。
 *      向下转型：
 *          1. 由于向下转型存在失败的可能性，因此在向下转型的时候，是需要进行强制类型转换的。是一个显式转换。
 *          2. 向下转型，存在失败的可能性。如果失败，会抛出 ClassCastException 异常。
 *          3. 向下转型后的对象，由于是子类类型，因此可以访问子类中独有的成员。
 */
public class Program {
    public static void main(String[] args) {
        lower1();
    }

    // 向下转型失败的情况
    private static void lower1() {
        Animal animal = new Animal();
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;

        }
    }

    // 向下转型
    private static void lower() {
        // 1. 实例化一个Dog对象并转型为Animal类型。（向上转型）
        Animal animal = new Dog();
        System.out.println(animal.name);
        // 2. 向下转型
        Dog dog = (Dog)animal;
        System.out.println(dog.name);
        System.out.println(dog.age);
    }

    // 2. 向上转型：由子类类型转型为父类类型
    //            父类的引用指向子类的对象
    private static void upper() {
        Dog dog = new Dog();
        System.out.println(dog.age);        // 由于dog是Dog类型的，此时是可以访问Dog类中独有的成员的。
        System.out.println(dog.name);
        // 将Dog类型的引用转型为父类Animal类型
        Animal animal = dog;                // 由于animal是Animal类型的，此时只能访问Animal类中的成员，访问不到Dog类中的成员了。
        System.out.println(animal.name);
        // System.out.println(animal.age);
    }

    // 1. 父类的引用指向之类的对象
    private static void code1() {
        // 把一个哈士奇对象当做是一只哈士奇
        Hashiqi hashiqi = new Hashiqi();
        // 把一个哈士奇对象当做是一只狗
        Dog dog = new Hashiqi();
        // 把一个哈士奇对象当做是一个动物
        Animal animal = new Hashiqi();
    }
}
