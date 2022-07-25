package day3.dIf;

// 《太吾绘卷》

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        int score = scanner.nextInt();

        // 案例：将一个成绩划分成不同的档次。
        // < 0 || > 100: 错误成绩
        // [0, 60): C
        // [60, 80): B
        // [80, 90): A
        // [90, 100]: S

        if (score > 100 || score < 0) {
            System.out.println("错误成绩");
        }
        else if (score < 60) { // [0, 60)
            System.out.println("C");
        }
        else if (score < 80) {   // [60, 80)
            System.out.println("B");
        }
        else if (score < 90) { // [80, 90)
            System.out.println("A");
        }
        else {  // [90, 100]
            System.out.println("S");
        }
    }
}
