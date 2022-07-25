package day6.aExercise;

public class HardOne {
    /**
     * 附加题附加作业：
     *      设计方法，计算一个数字的原码
     *      1. 需要考虑正数和负数
     *      2. 进行补位（不够8位凑齐8位，不够16位凑齐16位，不够32位凑齐32位）
     *      3. String str = "abc";      str.length() 获取字符串的长度
     */
    public static void main(String[] args) {
        String result = getBinary(100);
        System.out.println(result);
    }

    // 设计一个方法，计算一个正整数的二进制原码
    static String getBinary(int num) {
        if (num < 0) {
            return "";
        }
        // 辗转相除
        // 1. 定义一个字符串，用来拼接最后相加的结果
        String binary = "";
        // 2. 辗转相除
        while (num != 0) {
            // 2.1. 计算余数
            int last = num % 2;
            // 2.2. 将余数拼接到结果字符串中
            binary = last + binary;
            // 2.3. 将数字除2，方便下次的运算
            num /= 2;
        }

        return binary;
    }
}
