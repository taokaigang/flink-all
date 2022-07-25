package day13.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class UseCompute {
    // 使用指定的规则，对数字a和b进行运算
    public void useCom(Compute compute, int a, int b) {
        // 1. 使用Compute接口的引用，调用接口中的方法，完成对数字a和b的运算
        int result = compute.compute(a, b);
        // 2. 输出结果
        System.out.println(result);
    }
}
