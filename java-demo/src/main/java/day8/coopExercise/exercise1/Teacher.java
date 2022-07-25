package day8.coopExercise.exercise1;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description
 */
public class Teacher {
    String name;
    // 老师的行为：让学生做自我介绍
    void makeIntroduce(Student student) {
        // 调用方法：让学生自己去做自我介绍
        student.introduceSelf();
    }
}
