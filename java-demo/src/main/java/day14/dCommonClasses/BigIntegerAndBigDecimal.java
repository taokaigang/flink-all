package day14.dCommonClasses;

import java.math.BigInteger;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 */
public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {
        // 1. BigInteger类
        BigInteger n1 = new BigInteger("12347328461827364812736481726348712643872634871263847162348716239847612384761283746218375628761382764823764182734");
        BigInteger n2 = new BigInteger("38242374871238471987349872317623864716237591263875628764381239847198738764176239487198237591623487123846138758217");

        // 2. 四则运算
        BigInteger add = n1.add(n2);                    // 加法
        System.out.println(add);

        BigInteger subtract = n1.subtract(n2);          // 减法
        System.out.println(subtract);

        BigInteger multiply = n1.multiply(n2);          // 乘法
        System.out.println(multiply);

        BigInteger divide = n1.divide(n2);              // 除法
        System.out.println(divide);

        // 用n1除n2, 保留商和余数
        // 将商存到结果数组的第0位
        // 将余数存到结果数组的第1位
        BigInteger[] bigIntegers = n1.divideAndRemainder(n2);
        System.out.println(bigIntegers[0]);     // 输出商
        System.out.println(bigIntegers[1]);     // 输出余数

        long ret = bigIntegers[0].longValue();
    }
}
