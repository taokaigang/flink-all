package day24.bCollectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/23
 * @Description
 */
public class Program {

    public static void main(String[] args) {
        List<Student> dataSource = getDataSource();
        // 1. maxBy
        Student max = dataSource.stream()
                .collect(Collectors.maxBy((s1, s2) -> s1.getScore() - s2.getScore()))
                .get();
        System.out.println(max);

        // 2. minBy
        Student min = dataSource.stream()
                .collect(Collectors.minBy((s1, s2) -> s1.getScore() - s2.getScore()))
                .get();
        System.out.println(min);

        // 3. join: 将流中的每一个字符串直接拼接起来
        String join = dataSource.stream()
                .map(Student::getName)
                .collect(Collectors.joining());
        System.out.println(join);

        // 4. join: 将流中的字符串拼接起来，字符串之间以指定的字符串进行分隔
        String join1 = dataSource.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println(join1);

        // 5. join: 将流中的字符串拼接起来，字符串之间以指定的字符串进行分隔，以指定的字符串作为前后缀
        String join2 = dataSource.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(join2);

        // 6. summingInt: 将流中的数据转成int类型的数据，并求和
        int sum = dataSource.stream().collect(Collectors.summingInt(Student::getScore));
        System.out.println(sum);

        // 7. averagingInt: 将流中的数据转成int类型的数据，并计算平均值
        Double average = dataSource.stream().collect(Collectors.averagingInt(Student::getScore));
        System.out.println(average);

        // 8. summarizingInt: 将流中的数据映射成int类型的数据，并获取统计结果
        IntSummaryStatistics collect = dataSource.stream().collect(Collectors.summarizingInt(Student::getScore));
    }

    //
    private static List<Student> getDataSource() {
        // 1. 实例化一个ArrayList
        List<Student> list = new ArrayList<>();
        // 2. 添加数据
        Collections.addAll(list,
                new Student("xiaoming", 98),
                new Student("xiaohong", 100),
                new Student("xiaolv", 95),
                new Student("xiaolan", 88),
                new Student("xiaocheng", 90),
                new Student("dahuang", 65),
                new Student("dabai", 55),
                new Student("daqing", 59),
                new Student("dazi", 58),
                new Student("dahei", 68)
        );

        return list;
    }
}
