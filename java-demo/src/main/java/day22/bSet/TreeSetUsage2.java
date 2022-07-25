package day22.bSet;

import java.util.TreeSet;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description 如果在一个TreeSet集合中添加自定义的类型
 */
public class TreeSetUsage2 {
    public static void main(String[] args) {
        // 1. 实例化一个TreeSet对象
        TreeSet<Person> sets = new TreeSet<>();

        sets.add(new Person("xiaoming", 10, 100, 165, 50));
        sets.add(new Person("xiaohong", 11, 99, 164, 50));
        sets.add(new Person("xiaolan", 9, 98, 164, 51));
        sets.add(new Person("xiaolv", 8, 98, 166, 48));
        sets.add(new Person("xiaozi", 10, 97, 159, 46));

        // 2. 遍历集合
        sets.forEach(System.out::println);
        System.out.println(sets.size());
    }
}
