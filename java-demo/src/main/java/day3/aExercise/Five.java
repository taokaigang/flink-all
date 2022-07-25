package day3.aExercise;

public class Five {
    public static void main(String[] args) {
        // 设计一段程序，输出一个数字字符转成字符中的数字乘20，例如'1'需要输出数字20, '2'需要输出40
        // 重点: 需要从一个字符中，抠出来里面的数字是多少
        // 1. 准备一个字符
        char c = '4';
        // 2. 提取出单引号里面的数字
        int n = c - '0';
        // 3. 输出结果
        System.out.println(n * 20);
    }
}
