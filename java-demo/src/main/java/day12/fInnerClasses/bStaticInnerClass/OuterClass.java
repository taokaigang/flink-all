package day12.fInnerClasses.bStaticInnerClass;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *
 *      静态内部类：
 *          1. 书写位置：和类中的属性、方法平级，且使用关键字 static 修饰
 *          2. 静态内部类中，可以写属性、方法、构造方法...
 *          3. 静态内部类中，可以写静态属性、方法
 *          4. 编译之后生成的字节码文件，格式：外部类$内部类.class
 *          5. 对象的实例化，不需要借助外部类对象。
 */
public class OuterClass {
    /**
     * 此时这个类，是静态内部类
     */
    static class InnerClass {
        String name;
        public void show(String name) {
            System.out.println(name);
            System.out.println(this.name);
            // System.out.println(OuterClass.this.name);
        }
    }
}
