package day2.cChar;

/**
 * 字符型详解:
 *      1. 字符型的数据，是如何在计算机底层存储的。
 *         所有的数据，在计算机中存储和运算，都是以一个数字来进行的。即每一个字符，在底层都有一个与之对应的数字进行存储。
 *         记录字符与底层存储数据的关系表，称为是一个字符集。例如：ASCII、GB2312、GBK、unicode、UTF-8
 *      2. 字符类型，可以直接和整型进行等价交换。
 */
public class CharUsage {
    public static void main(String[] args) {
        char c = '张';
        System.out.println((int)c);

        int a = 'a';
        System.out.println(a);

        char c2 = 97;
        System.out.println(c2);
    }
}
