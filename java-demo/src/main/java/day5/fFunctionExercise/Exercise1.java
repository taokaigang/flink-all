package day5.fFunctionExercise;

public class Exercise1 {
    // 1. 设计一个方法，计算两个数字的最小公倍数
    static int calculate(int num1, int num2) {
        // 如何计算最小公倍数
        // 1.1. 计算 num1 和 num2 的最大值
        int max = num1 > num2 ? num1 : num2;
        // 1.2. 从最大值开始，往上遍历每一个数字
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int result1 = calculate(10, 20);

        int result2 = calculate(15, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
