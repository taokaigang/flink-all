package day14.dCommonClasses;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 */
public class MathUsage {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.PI);

        System.out.println(Math.abs(-3));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        System.out.println(Math.round(3.14));   // 四舍五入
        System.out.println(Math.floor(3.14));   // 向下取整，找到比这个数字小的第一个整数
        System.out.println(Math.ceil(3.14));    // 向上取整，找到比这个数字大的第一个整数

        System.out.println(Math.pow(2, 3));     // 计算2的3次方
        System.out.println(Math.sqrt(4));       // 计算4开平方
        // 需求：计算27的立方根
        System.out.println(Math.pow(27, 1/3.0));

        System.out.println(Math.random());              // [0, 1)
        System.out.println((int)(Math.random() * 100)); // [0, 100) 整型随机数


        // Math.sin()
        // Math.cos()
        // Math.tan()
        // Math.asin()
        // Math.acos()
        // Math.atan()
        // Math.log()
        // Math.log10()
    }
}
