package day3.bOperator;

/**
 * 算术运算符
 *      1. 整型和整型的计算结果还是整型，对于除运算来说，需要将计算的结果转成整型的数字，
 *      这个过程，舍去小数点后面所有的部分，只保留整数部分
 *      2. 重点内容：自增、自减运算符
 *      3.
 */
public class AArithmeticOperator {
    /*
            +  -  *  /  %(模运算、求余)
            ++ --
     */
    public static void main(String[] args) {
        // 1. 定义两个变量
        int a = 10, b = 3;

        // 2. 测试运算
        System.out.println(a + b);      // 13
        System.out.println(a - b);      // 7
        System.out.println(a * b);      // 30
        System.out.println(a / b);      // 3
        System.out.println(a % b);      // 1
        System.out.println("-----------");

        // 3. 重点！！！
        //    自增、自减运算符: 将一个变量的值，在现有的基础上加一或者减一。
        //    自增、自减运算符，可以放在变量前，也可以放在变量后。
        //    如果在变量前：表示先对这个变量进行运算，然后再使用这个变量的值。
        //    如果在变量后：表示先取这个变量的值，然后再对这个变量进行运算。
        //    System.out.println(a++);      // 10
        //    System.out.println(a);        // 11
        //    System.out.println(++a);      // 11
        //    System.out.println(a);        // 11
        System.out.println(a++);    // 10   a = 11
        System.out.println(--a);    // 10   a = 10
        System.out.println(a--);    // 10   a = 9
        System.out.println(++a);    // 10   a = 10
        System.out.println(a);      // 10
        System.out.println("---------");

        // 4. 关于加号的特殊使用
        //    除了可以对数字进行相加之外，还可以做字符串的拼接
        String s1 = "hello", s2 = "world";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println("---------");
        //    并不一定是两个字符串，才可以直接拼接
        //    只要加号的两端，有任意一方是字符串，那么都会自动的把另外一方转成字符串，拼接到一起
        String s4 = "hello";
        int num = 666;
        String s5 = s4 + num;
        System.out.println(s5);
        //     小练习
        System.out.println(1 + 2 + 3 + "hello" + 3 + 2 + 1);        // 6hello321
    }
}
