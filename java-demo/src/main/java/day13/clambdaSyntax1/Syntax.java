package day13.clambdaSyntax1;

import day13.bfunctionalInterfaces.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Syntax {
    public static void main(String[] args) {
        // 1. 无参、无返回值的方法实现
        NoneReturnNoneParameter lambda1 = () -> {
            System.out.println("无参、无返回值方法的实现");
        };
        lambda1.test();

        // 2. 有参、无返回值的方法实现
        NoneReturnSingleParameter lambda2 = (int a) -> {
            System.out.println("一个参数、无返回值方法的实现: 参数是 " + a);
        };
        lambda2.test(10);

        // 3. 多个参数、无返回值方法的实现
        NoneReturnMutipleParameter lambda3 = (int a, int b) -> {
            System.out.println("多个参数、无返回值方法的实现: 参数a是 " + a + ", 参数b是 " + b);
        };
        lambda3.test(10, 20);

        // 4. 无参、有返回值的方法的实现
        SingleReturnNoneParameter lambda4 = () -> {
            System.out.println("无参、有返回值方法的实现");
            return 666;
        };
        System.out.println(lambda4.test());

        // 5. 一个参数、有返回值的方法实现
        SingleReturnSingleParameter lambda5 = (int a) -> {
            System.out.println("一个参数、有返回值的方法实现: 参数是 " + a);
            return a * a;
        };
        System.out.println(lambda5.test(9));

        // 6. 多个参数、有返回值的方法实现
        SingleReturnMutipleParameter lambda6 = (int a, int b) -> {
            System.out.println("多个参数、有返回值的方法实现: 参数a是 " + a + ", 参数b是 " + b);
            return a * b;
        };
        System.out.println(lambda6.test(10, 20));
    }
}











