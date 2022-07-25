package day12.fInnerClasses.aInstanceInnerClass;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      成员内部类：
 *          1. 书写位置：与属性、方法平级别，且没有使用static修饰的类。
 *          2. 访问权限：内部类可以是任意的访问权限。
 *          3. 成员内部类中，不能写静态属性、静态方法。
 *          4. 编译之后生成的字节码文件格式：外部类$内部类.class
 *          5. 实例化对象，需要借助外部类的对象完成。
 */
public class OuterClass {
    String name = "Outer Name";

    /**
     * 此时，这个类与OuterClass的属性、方法平级别。
     * 都是OuterClass类中的成员。
     * 这样的类，是成员内部类
     */
    class InnerClass {
        String name = "Inner Name";
        public void show(String name) {
            System.out.println(name);                   // 参数name
            System.out.println(this.name);              // 内部类的属性name
            System.out.println(OuterClass.this.name);   // 外部类的属性name
        }
    }
}
