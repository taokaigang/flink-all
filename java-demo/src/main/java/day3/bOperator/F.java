package day3.bOperator;

/**
 * 三目运算符   ?:
 *      布尔变量/布尔结果的表达式 ? 值1 : 值2;
 *      如果问号前面的表达式结果是true，则最终取值1作为整体的结果。
 *      如果问号前面的表达式结果是false，则最终取值2作为整体的结果。
 */
public class F {
    public static void main(String[] args) {
        // 基础的语法
        // int num = false ? 10 : 20;
        // System.out.println(num);

        // 三目运算符的案例：计算两个数字的最大值
        int x = 10, y = 20;
        int max = x > y ? x : y;
        System.out.println(max);
    }
}
