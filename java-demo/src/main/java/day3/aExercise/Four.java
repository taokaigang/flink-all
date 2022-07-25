package day3.aExercise;

public class Four {
    public static void main(String[] args) {
        // 设计一段程序，将一个小写的英文字母转成对应的大写字母
        // 思路: 从字符在底层存储的数字入手，修改数字即可完成字符的转换
        // 1. 定义一个变量，用来存储一个小写字母
        char c = 'y';
        // 2. 计算小写字母和大写字母的差值
        int delta = 'a' - 'A';
        // 3. 将这个字符-32即可得到大写的字符
        char d = (char)(c - delta);
        // 4. 输出结果
        System.out.println(d);
    }
}
