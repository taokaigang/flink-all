package day12.fInnerClasses.dAnoymousInnerClass;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 借助Person类，写一个匿名内部类
        //    这里实例化的是Person类的一个匿名子类的对象，并完成了向上转型
        Person xiaoming = new Person() {
            @Override
            public void walk() {
                System.out.println("sub walk");
            }
        };

        xiaoming.walk();

        // 2. 借助接口，写一个匿名内部类
        //    这里，其实实例化的是一个接口的匿名实现类的对象，并且完成了向上转型
        Calculate calculate = new Calculate() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
    }
}

interface Calculate {
    int calculate(int a, int b);
}


abstract class Person {
    public void walk() {
        System.out.println("super walk");
    }
}

