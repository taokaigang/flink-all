package day5.bParameter;

/**
 * 方法的参数：
 *      作用：实现在两个方法之间，进行数据的交互。
 *      语法：参数，其实就是一个变量。只不过这个变量，是声明在方法的参数列表中（小括号里面）
 *      注意事项：
 *         1. 定义的时候：
 *              1. 参数，虽然说是一个变量，在定义的时候，也不能有初始值。
 *              2. 每一个参数，都必须明确一个类型。每一个参数前面的类型都不能省略。
 *              3. 参数列表中，可以有多个参数，并且，多个参数的类型可以是不一样的。
 *         2. 调用方法的时候：
 *              1. 在调用一个有参数的方法的时候，必须要给每一个参数赋值。
 *              2. 每一个参数，在赋值的时候，要保证顺序、类型必须一致。
 *     名词：
 *         1. 在方法定义的时候，参数列表中的参数，只负责声明有这样的一个参数，不知道具体的值。这个参数只是一个形式。称为是形式参数，简称 -- 形参。
 *         2. 在方法调用的时候，参数列表中的参数，可以明确形参的值。这样的参数称为是实际参数。简称 -- 实参。
 *         3. 在方法调用的过程中，使用实参给形参赋值。这个过程，被称为是 -- 传参。
 */
public class Parameter1 {

    public static void main(String[] args) {
        // 有参数的方法的调用
        // 在调用一个有参数的方法的时候，必须要给每一个参数赋值
        // 直接将需要给参数赋的值写到小括号里面即可
        check(10);
        check(9);

        add(10, 20, "aa");
        add(20, 10, "aa");
        // add("aa", 20, 30);
        add('a', 'b', "aa");
    }
    static void add(int a, int b, String s) {
        int x = 10, y = 2;
        int n, m;
    }

    /**
     * 判断这个数字是不是一个质数
     */
    static void check(int a) {
        boolean flag = a >= 2;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(a + "是质数");
        }
        else {
            System.out.println(a + "不是质数");
        }
    }
}
