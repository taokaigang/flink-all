package day3.bOperator;

/**
 * 逻辑运算符：
 *      &    |    ！    ^
 *      &&   ||
 * 注意：false&&（不执行），遇假即假
 *      true||（不执行），遇真即真
 */
public class D {
    public static void main(String[] args) {
        // 逻辑运算符，是操作两个boolean变量进行运算的结果
        // & : 与运算，两真即为真，有任意一个为假，结果即为假
        // | : 或运算，两假即为假，有任意一个为真，结果即为真
        // ! : 非运算，非真既假，非假既真
        // ^ : 异或运算，两个相同为假，两个不同为真
        System.out.println(true & false);       // false
        System.out.println(false & false);      // false
        System.out.println(true | false);       // true
        System.out.println(false | false);      // false
        System.out.println(!true);              // false
        System.out.println(true ^ true);        // false
        System.out.println(false ^ false);      // false
        System.out.println(true ^ false);       // true

        // &&: 短路与操作，运算的结果与&完全相同
        // ||: 短路或操作，运算的结果与|完全相同
        // 短路操作：
        //    如果逻辑运算符的前半部分，已经可以决定整体的结果了，那么右半部分将不参与运算
        int x = 10;
        boolean ret = x > 9 || x++ > 10;
        System.out.println(x);
        System.out.println(ret);
    }
}
