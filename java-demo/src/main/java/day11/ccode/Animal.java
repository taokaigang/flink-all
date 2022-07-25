package day11.ccode;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Animal {
    public void bark() {
        System.out.println("父类中的bark方法");
    }
}
class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("won~");
    }
}
class Cat extends Animal {
    @Override
    public void bark() {
        System.out.println("meow~");
    }
}