package day23.aExercise.one;

import java.util.HashSet;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个HashSet
        HashSet<Animal> set = new HashSet<>();
        // 2. 添加元素
        set.add(new Animal("001", "xiaoming", 11, Gender.Male));
        set.add(new Animal("002", "xiaohong", 12, Gender.Female));
        set.add(new Animal("003", "xiaobai", 11, Gender.Male));
        set.add(new Animal("003", "xiaobai", 11, Gender.Male));

        // 3. 输出结果
        System.out.println(set.size());
        set.forEach(System.out::println);
    }
}
