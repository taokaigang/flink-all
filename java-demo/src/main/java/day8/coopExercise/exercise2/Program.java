package day8.coopExercise.exercise2;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个 Person 对象
        Person lily = new Person();
        lily.name = "lily";
        lily.age = 18;

        // 2. 调用方法
        change(lily);

        // 3. 输出结果
        System.out.println(lily.name);
        System.out.println(lily.age);
    }

    static void change(Person person) {
        person.name = "lucy";
        person.age = 20;
    }
}
