package day11.ccode;


/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 将一个子类对象，作为实参，给形参Animal进行赋值，这个过程是一个向上转型
        // 使用向上转型后的对象，调用父类中的方法。如果如果这个方法在子类中已经被重写了，最终以子类的实现为准。
        // Animal animal = new Dog();
        makeBark(new Dog());
        makeBark(new Cat());
    }

    /**
     * 让动物叫
     * @param animal 动物对象
     */
    public static void makeBark(Animal animal) {
        animal.bark();
    }
}
