package day8.boop;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description
 */
public class Monster {
    // 类内的成员访问

    /*
        非静态方法中：可以直接访问当前类中的静态成员、非静态成员。
        静态方法中：可以直接访问当前类中的静态成员，不能直接访问当前类中的非静态成员。
     */
    String name;            // 非静态属性：name
    static int count;       // 静态属性：count

    // 非静态方法
    void show() {
        System.out.println(name);
        System.out.println(count);
        display();
    }
    // 静态方法
    static void display() {
        // System.out.println(name);
        // System.out.println(count);
        // show();
    }

}
