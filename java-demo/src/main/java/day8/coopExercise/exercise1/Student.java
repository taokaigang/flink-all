package day8.coopExercise.exercise1;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description 学生类
 */
public class Student {
    String name;
    int age;

    // 学生的行为：自我介绍
    void introduceSelf() {
        System.out.println("大家好，我叫 " + name + ", 我今年" + age + "岁了!");
    }
}
