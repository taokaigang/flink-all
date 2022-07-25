package day5.aExercise;

public class Six {
    public static void main(String[] args) {
        // 一个四位数字，恰巧等于去掉它首位数字之后所剩的三位数字的3倍，这个四位数字是多少
        for (int num = 1000; num <= 9999; num++) {
            // 1. 计算这个四位数字去除首位之后的数字
            int n = num % 1000;
            // 2. 比较
            if (num == n * 3) {
                System.out.println(num);
            }
        }
    }
}
