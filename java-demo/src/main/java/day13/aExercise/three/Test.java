package day13.aExercise.three;

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
        compute.useCom(new Compute() {
            @Override
            public int compute(int a, int b) {
                return a + b;
            }
        }, 10, 30);
        // 2.2. 完成减法计算
        compute.useCom(new Compute() {
            @Override
            public int compute(int a, int b) {
                return a * b;
            }
        }, 10, 30);
    }
}
