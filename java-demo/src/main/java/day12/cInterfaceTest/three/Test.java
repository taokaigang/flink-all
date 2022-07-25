package day12.cInterfaceTest.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个UseCompute对象
        UseCompute compute = new UseCompute();

        // 2. 调用计算的方法
        // 2.1. 完成加法计算
        compute.useCom(new Add(), 10, 20);
        // 2.2. 完成减法计算
        compute.useCom(new Minus(), 10, 20);
    }
}

class Add implements Compute {
    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}

class Minus implements Compute {
    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}
