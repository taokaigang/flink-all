package day8.coopExercise.exercise2;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description
 */
public class Program2 {
    public static void main(String[] args) {
        // 面向对象部分，非常容易遇到的异常：NullPointerException
        // 出现这个异常的原因：使用了一个空指针null，进行空间访问。
        // null:
        // 代表无，是引用数据类型的默认值。表示当前的这个引用，没有指向任何的空间。
        Person xiaoming = null;
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
    }
}
