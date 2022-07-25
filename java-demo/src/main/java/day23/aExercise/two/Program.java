package day23.aExercise.two;

import java.util.TreeSet;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个TreeSet对象
        TreeSet<Employee> set = new TreeSet<>();
        // 2. 添加元素
        set.add(new Employee("xiaohong", 32, 10, 10000));
        set.add(new Employee("xiaobai", 33, 9, 9000));
        set.add(new Employee("xiaohei", 31, 12, 13000));
        set.add(new Employee("xiaolv", 32, 9, 10000));
        set.add(new Employee("xiaozi", 32, 9, 11000));

        set.forEach(System.out::println);
    }
}
