package day5.dOverload;

/**
 * 重载 Overload: 只跟方法的名字、参数有关系，与返回值无关
 *      重载方法的区分调用：通过实参区分调用不同的重载方法
 */
public class Program {
    public static void main(String[] args) {
        calculate();
        calculate(10);
        calculate(10, "hello");
    }

    static void calculate() {
        System.out.println("calculate()");
    }

    static void calculate(int a) {
        System.out.println("calculate(int)");
    }

    static void calculate(int a, String b) {
        System.out.println("calculate(int, String)");
    }

    static void calculate(String a) {
        System.out.println("calculate(String)");
    }

    static void calculate(String a, int b) {
        System.out.println("calculate(String, int)");
    }

}
