package day8.coopExercise.exercise1;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description
 */
public class Program {
    // 场景模拟：老师让学生做自我介绍
    // 类：老师类、学生类
    // 老师类： 属性：名字
    //        行为：让学生做自我介绍
    // 学生类： 属性：名字、年龄
    //        行为：自我介绍
    public static void main(String[] args) {
        // 1. 实例化一个老师对象
        Teacher uncleWang = new Teacher();
        uncleWang.name = "王叔叔";

        // 2. 实例化几个学生对象
        Student xiaoming = new Student();
        xiaoming.name = "小明";
        xiaoming.age = 10;

        Student xiaohong = new Student();
        xiaohong.name = "小红";
        xiaohong.age = 9;

        // 3. 老师让学生做自我介绍
        uncleWang.makeIntroduce(xiaoming);
        uncleWang.makeIntroduce(xiaohong);



    }

}
