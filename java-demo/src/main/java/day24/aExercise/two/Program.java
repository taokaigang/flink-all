package day24.aExercise.two;

import java.util.ArrayList;
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
    /*
        name:xiaoming,age:10岁,gender:male,height:172cm,weight:70kg
        age:20岁,height:177cm,name:xiaobai,weight:80kg,gender:male
        gender:female,height:176cm,weight:66kg,name:xiaolv,age:21岁
     */
    public static void main(String[] args) {
        // 1. 获取数据源
        List<Person> list = getDataSource();

        // 2.2. 删除集合中所有的未成年的数据
        System.out.println("----------2.2. 删除集合中所有的未成年的数据----------");
        list.removeIf(person -> person.getAge() < 18);

        // 2.3. 计算所有⼈的平均年龄、最⼤年龄、最⼩年龄
        System.out.println("----------2.3. 计算所有⼈的平均年龄、最⼤年龄、最⼩年龄----------");
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Person::getAge).summaryStatistics();
        System.out.println("平均年龄: " + intSummaryStatistics.getAverage());
        System.out.println("最大年龄: " + intSummaryStatistics.getMax());
        System.out.println("最小年龄: " + intSummaryStatistics.getMin());

        // 2.4. 将集合中的数据按照年龄进⾏降序排序，若年龄相同，按照身⾼降序排序
        System.out.println("----------2.4. 将集合中的数据按照年龄进⾏降序排序，若年龄相同，按照身⾼降序排序----------");
        list.sort((p1, p2) -> {
            if (p1.getAge() != p2.getAge()) {
                return p2.getAge() - p1.getAge();
            }
            return p2.getHeight() - p1.getHeight();
        });

        // 2.5. 查询集合中所有的年龄在[20, 25]范围内，体重在[60, 80]范围内的数据，按照身⾼降序排列，截取第4名到第8名。
        list.stream().filter(person -> person.getAge() >= 20 && person.getAge() <= 25)
                .filter(person -> person.getWeight() >= 60 && person.getWeight() <= 80)
                .sorted((p1, p2) -> p2.getHeight() - p1.getHeight())
                .limit(8)
                .skip(3)
                .forEach(System.out::println);


        list.forEach(System.out::println);
    }

    private static List<Person> getDataSource() {
        String infos = "name:xiaoming,age:10岁,gender:male,height:172cm,weight:70kg\n" +
                "age:20岁,height:177cm,name:xiaobai,weight:80kg,gender:male\n" +
                "gender:female,height:176cm,weight:66kg,name:xiaolv,age:21岁";
        // 1. 按照换行符切割字符串，得出每一行的信息
        String[] lines = infos.split("\n");
        // 2. 实例化一个集合，存储有Person对象信息
        List<Person> list = new ArrayList<>();
        // 3. 添加信息
        for (String line : lines) {
            // 把每一行的信息，封装成一个Person对象，存入集合list
            list.add(new Person(line));
        }
        return list;
    }
}
