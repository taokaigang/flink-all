package day10.binheritance.two.a;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Animal对象
        Animal animal = new Animal();
        // 2. 进行成员访问
        // System.out.println(animal.privateField); // 私有权限的在类外访问不到
        System.out.println(animal.defaultField);
        System.out.println(animal.protectedField);
        System.out.println(animal.publicField);
    }
}
