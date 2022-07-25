package day23.bStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description 中间操作
 */
public class EProcessOperation {

    public static void main(String[] args) {
        // 1. 获取数据源
        List<Person> list = getDataSource();

        // 2. 中间操作filter
        // list.stream().filter(ele -> ele.getAge() > 10).forEach(System.out::println);

        // 3. 中间操作distinct
        // list.stream().distinct().forEach(System.out::println);

        // 4. 中间操作sorted
        // list.stream().sorted().forEach(System.out::println);
        // list.stream().sorted((p1, p2) -> p1.getHeight() - p2.getHeight()).forEach(System.out::println);

        // 5. 中间操作limit
        // list.stream().limit(5).forEach(System.out::println);
        // 需求: 获取身高前5名
        // list.stream().sorted((p1, p2) -> p2.getHeight() - p1.getHeight())
        //              .limit(5)
        //              .forEach(System.out::println);

        // 6. 中间操作skip
        // 需求：截取身高的 [4,7] 名
        // list.stream().sorted((p1, p2) -> p2.getHeight() - p1.getHeight())
        //         .limit(7)
        //         .skip(3)
        //         .forEach(System.out::println);

        // 7. 中间操作map
        // 需求：将一个存储了所有的Person对象的集合，将所有的名字提取出来，单独存放到一个集合中。
        // List<String> names = list.stream().map(Person::getName).collect(Collectors.toList());

        // 8. mapToInt
        // 计算一个存储了所有的Person对象的流中的年龄平均值。
        double asDouble = list.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(asDouble);
    }

    /**
     * 获取数据源
     * @return 存储了若干个Person对象的数据源
     */
    private static List<Person> getDataSource() {
        List<Person> list = new ArrayList<>();
        Collections.addAll(list,
                new Person("Han Meimei", 11, 165, 45),
                new Person("Li Lei", 12, 168, 51),
                new Person("Lucy", 12, 166, 50),
                new Person("Lily", 12, 166, 49),
                new Person("Polly", 3, 92, 22),
                new Person("Tom", 13, 162, 52),
                new Person("Jerry", 2, 88, 18),
                new Person("Lin Tao", 11, 162, 53),
                new Person("Jim", 14, 167, 51),
                new Person("Jim", 14, 167, 51)
        );
        return list;
    }
}
