package day13.dlambdaSyntax2;

import day13.bfunctionalInterfaces.SingleReturnMutipleParameter;
import day13.bfunctionalInterfaces.SingleReturnSingleParameter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Syntax1 {
    // 静态方法的引用
    public static void main(String[] args) {
        // 实现一个多个参数的、一个返回值的接口
        // SingleReturnMutipleParameter lambda1 = (a, b) -> Calculator.calculate(a, b);

        // 对一个静态方法的引用
        // 类::静态方法
        //
        SingleReturnMutipleParameter lambda1 = Calculator::calculate;
        System.out.println(lambda1.test(10, 20));

    }

    private static class Calculator {
        public static int calculate(int a, int b) {
            // 稍微复杂的逻辑：计算a和b的差值的绝对值
            if (a > b) {
                return a - b;
            }
            return b - a;
        }
    }
}
