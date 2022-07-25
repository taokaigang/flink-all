package day13.glambdaExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个 UseCompute 对象
        UseCompute compute = new UseCompute();

        // 2. 调用计算的方法
        compute.useCom((a, b) -> a + b, 10, 20);
        compute.useCom((a, b) -> a - b, 10, 20);
        compute.useCom((a, b) -> a * b, 10, 20);
        compute.useCom((a, b) -> a / b, 10, 20);
    }
}
