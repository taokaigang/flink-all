package day12.fInnerClasses.cLocalInnerClass;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *
 *      局部内部类：
 *          1. 书写位置：写在一个类的方法内部，作用域仅限于当前方法。
 *          2. 局部内部类，编译后生成的字节码文件格式：外部类$序号内部类名.class
 *          3.
 */
public class Program {

    private static int b = 10;

    public static void main(String[] args) {

        // 定义一个局部变量
        // 如果这个局部变量，被包裹在了一个局部代码段中（比如局部内部类、匿名内部类），此时这个局部变量会被隐式的定义为final
        int a = 10;

        // 在一个类的方法中，直接定义一个内部类
        class InnerClass {
            String name;
            public void show() {
                System.out.println(a);
                System.out.println(b++);
            }
        }
    }

    public static void test() {

    }

}
