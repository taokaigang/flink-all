package day16.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Person对象
        Person xiaoming = new Person("小明","2000-08-06", Gender.Male);
        // 2. 输出小明
        System.out.println(xiaoming); // 姓名: 小明, 生日: 2000年8月6日， 性别: 男
    }
}
