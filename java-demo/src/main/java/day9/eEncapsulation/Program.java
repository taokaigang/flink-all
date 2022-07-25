package day9.eEncapsulation;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Person对象
        Person xiaoming = new Person();

        xiaoming.setName("xiaoming");
        System.out.println(xiaoming.getName());

        xiaoming.setAge(100);
        System.out.println(xiaoming.getAge());
    }
}
