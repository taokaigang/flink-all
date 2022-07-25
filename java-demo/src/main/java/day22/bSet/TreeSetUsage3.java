package day22.bSet;

import java.util.TreeSet;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description 通过Comparator进行比较
 */
public class TreeSetUsage3 {
    public static void main(String[] args) {
        // 1. 实例化一个TreeSet对象
        //    可以通过Comparator进行TreeSet的实例化。使用指定的规则进行大小比较。
        //    此时，集合中存储的元素可以不实现Comparable接口
        TreeSet<Person> sets = new TreeSet<>((p1, p2) -> p1.height - p2.height);

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
