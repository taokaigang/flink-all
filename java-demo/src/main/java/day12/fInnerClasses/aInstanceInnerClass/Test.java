package day12.fInnerClasses.aInstanceInnerClass;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 需求：实例化一个成员内部类的对象
        // 1. 先实例化外部类的对象
        OuterClass outerClass = new OuterClass();
        // 2. 借助外部类对象，实例化内部类对象
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        // 3. 内部类的成员访问
        innerClass.show("Parameter Name");
    }
}
