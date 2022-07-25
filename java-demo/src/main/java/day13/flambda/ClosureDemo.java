package day13.flambda;

import day13.bfunctionalInterfaces.NoneReturnNoneParameter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class ClosureDemo {
    public static void main(String[] args) {
        // 调用方法，并获取返回值
        NoneReturnNoneParameter test = test();
        // 使用这个接口的引用，调用接口中的方法
        test.test();
    }

    private static NoneReturnNoneParameter test() {
        // 1. 定义一个局部变量
        int a = 10;
        // 2. 定义一个接口的实现
        // 3. 返回结果
        return () -> {
            System.out.println(a);
        };
    }
}
