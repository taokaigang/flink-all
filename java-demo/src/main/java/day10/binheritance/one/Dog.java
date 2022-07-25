package day10.binheritance.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 *      当前Dog类继承自Animal类。
 *      此时Animal类中的属性、方法，是可以赠予Dog类的。
 *      Dog类继承到了Animal类中的属性、方法
 */
public class Dog extends Animal {
    // Dog类在继承到父类的成员的同时，还可以添加自己独有的属性、方法
    public String furColor;

    public void bark() {
        System.out.println("Won~");
    }
}
