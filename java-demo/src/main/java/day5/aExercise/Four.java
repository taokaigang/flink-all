package day5.aExercise;

public class Four {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

        // 记录要计算的斐波那契数列中的第n位的前两位数字。
        int num1 = 1, num2 = 1;
        // 循环输出30位的斐波那契数列
        for (int i = 1; i <= 30; i++) {
            // 前两位的数字，不用计算规律
            if (i == 1 || i == 2) {
                System.out.println(1);
                continue;
            }
            // 后面的数字输出，计算结果
            int num = num1 + num2;
            System.out.println(num);
            // 修改num1和num2的值，使得可以计算下一个数字
            num1 = num2;
            num2 = num;
        }
    }
}
