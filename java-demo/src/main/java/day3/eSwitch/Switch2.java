package day3.eSwitch;

import java.util.Scanner;

/**
 * 解决穿透性： break
 */
public class Switch2 {
    public static void main(String[] args) {
        // 1. 从控制台输入一个季节
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();

        // 2. 输出这个数字对应的季节
        switch (season) {
            case 1:
                System.out.println("春天，春困");
                break;
            case 2:
                System.out.println("夏天，夏无力");
                break;
            case 3:
                System.out.println("秋天，秋乏");
                break;
            case 4:
                System.out.println("冬天，冬眠");
                break;

            // 理论上来讲，default可以写在所有的case之前、所有的case之后、两次case之间
            // 但是，实际使用中，常常写在所有的case之后
            default:
                System.out.println("错误的季节，是一个适合学习的季节");
                break;
        }

    }
}
