package day12.fInnerClasses.dAnoymousInnerClass.exercise;

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
        Compute add = new Compute() {
            @Override
            public int compute(int a, int b) {
                return a + b;
            }
        };
        compute.useCom(add, 10, 20);
    }
}
