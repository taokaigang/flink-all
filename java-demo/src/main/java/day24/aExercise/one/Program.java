package day24.aExercise.one;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/23
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 获取数据源
        List<Student> list = getDataSource();

        //1. 所有及格的学⽣信息
        list.stream().filter(student -> student.getScore() >= 60).forEach(System.out::println);
        //2. 所有及格的学⽣姓名
        list.stream().filter(student -> student.getScore() >= 60)
                .map(Student::getName)
                .forEach(System.out::println);
        //3. 所有学⽣的平均成绩
        double average = list.stream().mapToInt(Student::getScore)
                .summaryStatistics()
                .getAverage();
        System.out.println(average);
        //4. 班级的前3名(按照成绩)
        list.stream().sorted().limit(3).forEach(System.out::println);
        //5. 班级的3-10名(按照成绩)
        list.stream().sorted().limit(10).skip(2).forEach(System.out::println);
        //6. 所有不不及格的学⽣平均成绩
        average = list.stream().filter(student -> student.getScore() < 60)
                .mapToInt(Student::getScore)
                .summaryStatistics()
                .getAverage();
        System.out.println(average);
        //7. 将及格的学⽣, 按照成绩降序输出所有信息
        list.stream().filter(student -> student.getScore() >= 60)
                .sorted()
                .forEach(System.out::println);
        //8. 班级学⽣的总分
        int sum = list.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum);
    }

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
