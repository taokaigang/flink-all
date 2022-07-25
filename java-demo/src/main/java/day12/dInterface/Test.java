package day12.dInterface;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      Java8中的接口新特性
 */
public class Test {
    public static void main(String[] args) {
        MyInterface.staticTest();
        // MyInterfaceImpl.staticTest();


    }
}

interface MyInterface {
    // Java 8新特性1：可以给接口中的方法添加默认的实现。
    // 可以使用关键字 default，修饰接口方法，使得这个方法有一个默认的实现逻辑。
    // 此时，这个方法不再是一个抽象方法。实现类可以重写这个方法，也可以不重写。
    public default void test() {
        System.out.println("MyInterface test()");
    }

    // Java 8新特性2：可以给接口添加静态方法。
    // 静态方法，也是必须要有方法体部分的。
    // 这个方法，只能由接口调用。实现类是无法访问的。
    public static void staticTest() {
        System.out.println("MyInterface staticTest()");
    }
}

class MyInterfaceImpl implements MyInterface {

}
