package day4.aExercise;

import java.util.Scanner;

public class Three {
    // 从控制台输入一个成绩，成绩在[0,60)范围内，输出C；成绩在[60,80)范围内，输出B；成绩在[80,100]范围内，输出A。
    public static void main(String[] args) {
        // 1. 输入一个成绩
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        // 2. 根据成绩的范围，执行不同的输出结果
        if (score >= 0 && score < 60) {
            System.out.println("C");
        }
        else if (score >= 60 && score < 80) {
            System.out.println("B");
        }
        else if (score >= 80 && score <= 100) {
            System.out.println("A");
        }
    }
}
