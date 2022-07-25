package day13.clambdaSyntax1;

// 借助已经存在的函数式接口，讲解lambda表达式的基础语法
import day13.bfunctionalInterfaces.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 无参、无返回值的函数式接口
        interfaceImpl();
    }

    private static void interfaceImpl() {
        // 1. 使用显式的实现类对象
        SingleReturnSingleParameter parameter1 = new Impl();
        // 2. 使用匿名内部类实现
        SingleReturnSingleParameter parameter2 = new SingleReturnSingleParameter() {
            @Override
            public int test(int a) {
                return a * a;
            }
        };
        // 3. 使用lambda表达式实现
        SingleReturnSingleParameter parameter3 = a -> a * a;

        System.out.println(parameter1.test(10));
        System.out.println(parameter2.test(10));
        System.out.println(parameter3.test(10));
    }

    private static class Impl implements SingleReturnSingleParameter {

        @Override
        public int test(int a) {
            return a * a;
        }
    }
}
