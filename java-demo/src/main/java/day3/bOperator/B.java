package day3.bOperator;

/**
 * 赋值运算符： = 将等号右边的值，给左边的变量进行赋值
 */
public class B {
    public static void main(String[] args) {
        // 赋值运算
        int a = 10;
        int b = a;

        // 组合运算符
        a += 20;    // a = a + 20;
        a -= 20;    // a = a - 20;
        a *= 20;    // a = a * 20;
        a /= 20;    // a = a / 20;
        a %= 20;    // a = a % 20;

        // 组合运算符，除了最基本的运算之外，还会自动的进行类型转换
        byte n = 10;
        n += 10;    // n = (byte)(n + 10);

        char c = 'a';
        c -= 32;    // c = (char)(c - 32);

        // 赋值运算符，是有运算结果的，赋值运算的结果，是赋值完成后，这个变量的值
        System.out.println(10 + 20);
        int x;
        System.out.println(x = 30);
    }
}

