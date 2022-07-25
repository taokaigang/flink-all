package day17.bString;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description 字符串常用的非静态方法
 */
public class StringMethod2 {
    public static void main(String[] args) {
        // 1. 字符串的拼接，效率比加号拼接高
        String ret1 = "hello".concat("world");
        System.out.println(ret1);       // helloworld

        // 2. 字符串截取
        String ret2 = "hello world".substring(3);
        System.out.println(ret2);       // lo world
        String ret3 = "hello world".substring(3, 8);
        System.out.println(ret3);       // lo wo
        // *. 字符序列截取
        CharSequence charSequence = "hello world".subSequence(3, 8);
        System.out.println(charSequence);

        // 3. 用新的字符替换原字符串中所有的旧的字符
        String ret4 = "hello world".replace('l', 'L');
        System.out.println(ret4);       // heLLo worLd
        // 4. 用新的字符序列替换原字符串中所有的旧的字符序列
        String ret5 = "hello world".replace("ll", "~");
        System.out.println(ret5);       // he~o world

        // 5. 转成字符数组
        char[] ret6 = "hello world".toCharArray();
        System.out.println(Arrays.toString(ret6));      // [h, e, l, l, o,  , w, o, r, l, d]
        // 6. 转成字节数组
        byte[] ret7 = "hello world".getBytes();
        System.out.println(Arrays.toString(ret7));      // [104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100]


        // 7. 获取某一个字符在一个字符串中第一次出现的下标。
        int ret8 = "hello world".indexOf('L');
        System.out.println(ret8);                   // 2
        // 8. 获取某一个字符在一个字符串中从fromIndex位开始往后，第一次出现的下标。
        int ret9 = "hello world".indexOf('l', 4);
        System.out.println(ret9);                   // 9
        // 9. 获取某一个字符在一个字符串中最后一次出现的下标。
        int ret10 = "hello world".lastIndexOf('o');
        System.out.println(ret10);                  // 7
        // 10. 获取某一个字符在一个字符串中，从fromIndex位开始往前，最后一次出现的下标
        int ret11 = "hello world".lastIndexOf('o', 5);
        System.out.println(ret11);                  // 4

        // 11. 字符串大小写字母转变
        System.out.println("hello WORLD".toUpperCase());
        System.out.println("hello WORLD".toLowerCase());

        // 12. 判断一个字符串中， 是否包含另外一个字符串。
        System.out.println("hello world".contains("loo"));

        // 需求：判断一个字符串中是否包含某一个字符
        // 答案：或者这个字符在字符串中出现的下标，如果不是-1，说明包含。

        // 13. 判断一个字符串， 是否是以指定的字符串作为开头。
        System.out.println("哈利波特与魔法石.mp4".startsWith("哈利波特"));
        System.out.println("哈利波特与魔法石.mp4".endsWith(".mp4"));

        // 14. 去除一个字符串首尾的空格
        System.out.println("        hello world        ".trim());

        // 15. 判断两个字符串的内容是否相同
        System.out.println("hello world".equals("HELLO WORLD"));
        System.out.println("hello world".equalsIgnoreCase("HELLO WORLD"));  // true

        // 16. 比较两个字符串的大小
        //     > 0: 前面的字符串 > 参数字符串
        //    == 0: 两个字符串大小相等
        //     < 0: 前面的字符串 < 参数字符串

        // 比较逻辑：
        // 依次比较每一位的字符的大小。
        // 如果某一次的字符比较可以分出大小，本次的比较结果将作为整体的字符串的比较结果。

        int result = "hello world".compareTo("hh");
        System.out.println(result);
    }
}
