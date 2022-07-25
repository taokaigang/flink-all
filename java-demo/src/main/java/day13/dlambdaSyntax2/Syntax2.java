package day13.dlambdaSyntax2;

import day13.bfunctionalInterfaces.NoneReturnSingleParameter;
import day13.bfunctionalInterfaces.SingleReturnMutipleParameter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Syntax2 {
    public static void main(String[] args) {
        // 对非静态方法的引用，需要使用对象来完成
        SingleReturnMutipleParameter lambda = new Calculator()::calculate;
        System.out.println(lambda.test(10, 30));

        NoneReturnSingleParameter lambda2 = System.out::println;
        lambda2.test(10);
    }

    private static class Calculator {
        public int calculate(int a, int b) {
            return a > b ? a - b : b - a;
        }
    }
}
