package day9.fsingleton;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Program {
    // 单例设计模式：
    //  在一个项目中任意的模块下，都可以获取到一个类的同一个对象
    //  某一个类，有且只能有一个对象
    public static void main(String[] args) {
        // 获取单例类 Boss 对象
        for (int i = 0; i < 1000; i++) {
            Boss.getInstance();
        }
    }
}
