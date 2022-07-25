package day18.aExercise.five;

import sun.text.normalizer.UCharacter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description 【中】将一个字符串中最后一次出现的指定字符替换成大小写翻转的字符
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(reverse("hello", 'l'));
    }

    private static String reverse(String str, char c) {
        // 1. 找到这个字符最后一次出现的下标
        int index = str.lastIndexOf(c);
        // 2. 特殊处理
        if (index == -1) {
            return str;
        }
        // 3. 计算字符c大小写翻转之后的字符
        if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
        }
        else if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }

        return str.substring(0, index) + c + str.substring(index + 1);
    }
}
