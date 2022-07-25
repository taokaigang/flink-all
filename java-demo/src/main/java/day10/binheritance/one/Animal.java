package day10.binheritance.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Animal {
    public String name;
    public int age;
    public char gender;

    public void eat() { }
    public void sleep() { }
    public void walk() {
        System.out.println("四条腿走路");
    }
}
