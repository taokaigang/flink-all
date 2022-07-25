package day13.clambdaSyntax1;

import day13.bfunctionalInterfaces.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Syntax2 {
    public static void main(String[] args) {
        // 多个参数、无返回值的方法实现
        NoneReturnMutipleParameter lambda1 = (a, b) -> {
            System.out.println("多个参数、无返回值方法的实现: 参数a是 " + a + ", 参数b是 " + b);
        };

        // 有参、无返回值的方法实现
        NoneReturnSingleParameter lambda2 = a -> System.out.println("一个参数、无返回值方法的实现: 参数是 " + a);

        SingleReturnMutipleParameter lambda3 = (a, b) -> a + b;


    }
}
