package day3.eSwitch;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        // 1. 从控制台输入一个季节
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();

        // 2. 输出这个数字对应的季节
        switch (season) {
            case 1:
                System.out.println("春天，春困");
            case 2:
                System.out.println("夏天，夏无力");
            case 3:
                System.out.println("秋天，秋乏");
            case 4:
                System.out.println("冬天，冬眠");

            default:
                System.out.println("错误的季节，是一个适合学习的季节");
        }

    }
}
