package day9.dConstructor;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 通过一个无参构造，实例化一个Person对象
        // Person xiaoming = new Person();

        // 2. 通过一个有参构造，实例化Person对象
        // Person laowang = new Person("laowang", 35, '男');

        // 3. 通过一个无参参数的构造方法，实例化Person对象
        Person xiaolaodi  = new Person("小老弟", 18, '男', 170, 55);


        // xiaolaodi.run();

        System.out.println(xiaolaodi.name);
        System.out.println(xiaolaodi.age);
        System.out.println(xiaolaodi.gender);
        System.out.println(xiaolaodi.height);
        System.out.println(xiaolaodi.weight);
    }
}
