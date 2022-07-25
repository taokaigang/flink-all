package day2.aVariable;

/**
 * 各种数据类型的变量定义与使用
 * 拓展：字符串
 */
public class Types {
    public static void main(String[] args) {
        // 1. 整型部分
        //    注意事项：
        //        1. 考虑到每一种数据类型的取值范围，不要写的值过大。
        //        2. long的特殊处理：整型字面量，最大能够写到 2^31-1，如果需要写更大的整型字面量(超过默认的int)，需要在最后加一个 L
        byte i1 = 10;
        short i2 = 10;
        int i3 = 10;
        long i4 = 2147483648L;

        // 2. 浮点型部分
        //    注意事项：
        //        1. 如果需要给一个float变量赋值，需要在字面量最后添加一个 f或者F
        //        2. 小数字面量，默认的类型是double型。
        float f1 = 3.1415F;
        double f2 = 3.1415;
        double f3 = 3E5;        // 科学计数法表示的数字，3 x 10^5
        System.out.println(f3);

        // 3. 布尔型
        boolean b1 = true;
        boolean b2 = false;

        // 4. 字符型
        //    字符，需要写在单引号里面，并且，单引号中有且只能有一个字符
        char c1 = 'a';

        // 5. 附加：字符串 String
        //    字符串：由若干个字符组成的一个有序序列。
        //    组成一个字符串的所有的字符，有序的写在一对双引号中，双引号中的字符数量不限制。
        String s1 = "hello, world";
    }
}
