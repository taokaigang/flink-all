package day4.gMethod;

/**
 * 方法的执行顺序：
 */
public class Method2 {
    public static void main(String[] args) {

        System.out.println("0");
        method1();
        System.out.println("5");
    }

    static void method1() {
        System.out.println("1");
        method2();
    }
    static void method2() {
        method3();
        System.out.println("2");
    }
    static void method3() {
        System.out.println("3");
    }
    static void method4() {
        System.out.println("4");
    }
}
