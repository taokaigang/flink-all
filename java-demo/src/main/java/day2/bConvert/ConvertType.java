package day2.bConvert;

/**
 * 数据类型转换：
 *      1. 自动类型转换：由于不存在任何的值溢出的情况，不需要进行额外的操作，这个过程被称为 --> 隐式转换
 *      2. 强制类型转换：由于存在值溢出的可能性，需要进行额外的操作，这个过程被称为 --> 显式转换
 */
public class ConvertType {
    public static void main(String[] args) {
        // 1. 自动类型转换案例：
        byte a = 10;
        //    所谓的转型为int类型，其实是定义一个int类型的新的变量，用原来a的值，给这个新的变量赋值。
        int b = a;
        System.out.println(b);

        // 2. 强制类型转换案例:
        //    这个过程不能自动完成，需要强制完成
        int c = 200;
        byte d = (byte)c;
        System.out.println(d);

        /*
            128 + 64 + 8
            0000 0000 0000 0000 0000 0000 1100 1000
            在转型为byte的时候，只保留后8位。
            1100 1000 ==计算原码==> 1011 1000 ==> -(32+16+8) => -56
         */

        // 3. 浮点型数据，转型为整型，这个过程，也是一个强制类型转换
        //    浮点型数据转整型，这个过程中，保留整数部分，舍去所有的小数部分
        float pi = -3.94f;
        int n = (int)pi;
        System.out.println(n);
    }
}