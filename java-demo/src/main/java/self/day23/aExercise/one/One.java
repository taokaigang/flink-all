package self.day23.aExercise.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class One {
    /**
     *  【简】需求: ⼀个集合中存储了了若⼲个Student对象, 要求查询出以下结果:(Student类根据需求⾃⼰设计)
     * 1. 所有及格的学⽣信息
     * 2. 所有及格的学⽣姓名
     * 3. 所有学⽣的平均成绩
     * 4. 班级的前3名(按照成绩)
     * 5. 班级的3-10名(按照成绩)
     * 6. 所有不不及格的学⽣平均成绩
     * 7. 将及格的学⽣, 按照成绩降序输出所有信息
     * 8. 班级学⽣的总分
     * @param args
     */
    public static void main(String[] args) {
        Collection<Student> collection=new ArrayList<>();
        Collections.addAll(collection,
                new Student("张三",70),
                new Student("李四",80),
                new Student("王五",90),
                new Student("赵六",88),
                new Student("钱七",78),
                new Student("Lucy",50),
                new Student("韩梅梅",87),
                new Student("Li Lei",43),
                new Student("Li Hua",59),
                new Student("Li Jie",59)
                );
        collection.stream().filter(ele -> ele.getScore() >= 60).forEach(System.out::println);

        collection.stream().filter(ele -> ele.getScore() >= 60).map(Student::getName).forEach(System.out::println);

        double asDouble = collection.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.println(asDouble);

        collection.stream().sorted((p1,p2)->p2.getScore()-p1.getScore()).limit(3).forEach(System.out::println);

        collection.stream().sorted((p1,p2)->p2.getScore()-p1.getScore()).limit(10).skip(2).forEach(System.out::println);

        double asDouble2 = collection.stream().filter(ele -> ele.getScore() < 60).mapToInt(Student::getScore).average().getAsDouble();
        System.out.println(asDouble2);

        collection.stream().filter(ele -> ele.getScore() >= 60).sorted((p1,p2)->p2.getScore()-p1.getScore()).forEach(System.out::println);

        int sum = collection.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum);

    }

}
