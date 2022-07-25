package day4.bFor;

public class For3 {
    public static void main(String[] args) {
        // for循环的特殊的语法
        // 1. 循环小括号中的每一部分，都不是必须要写的内容，都是可以省略的。
        // 2. 如果循环体中的代码只有一行，则大括号可以省略。
        // 案例：输出100以内的每一个数字

        int i = 1;
        for (; i <= 100;) {
            System.out.println(i);
            i++;
        }
    }
}
