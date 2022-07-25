package day16.aExercise.three;

import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Game {
    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        while (true) {
            // 1. 用户输入
            System.out.println("请输入您的选择:");
            System.out.println("1. 石头    2. 剪刀    3. 布");
            // 2. 获取用户的输入
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("选择有误，请重新输入:");
                continue;
            }
            // 3. 随机生成一个系统的选择
            int system = (int)(Math.random() * 3) + 1;
            // 4. 比较大小
            judge(choice, system);
        }
    }

    // 比较两个选择，并输出游戏结果
    private static void judge(int user, int system) {
        // 输出用户的选择，和系统的选择
        System.out.println("您的选择是: " + getChoiceStr(user));
        System.out.println("系统选择是: " + getChoiceStr(system));

        // 大小比较
        if (user == 1 && system == 3) {
            System.out.println("系统获胜");
        }
        else if (user == 3 && system == 1) {
            System.out.println("您获胜");
        }
        else if(user > system) {
            System.out.println("系统获胜");
        }
        else if(user < system) {
            System.out.println("您获胜");
        }
        else {
            System.out.println("平局");
        }
    }

    // 根据选择的序号，返回选择的内容字符串
    private static String getChoiceStr(int choice) {
        switch (choice) {
            case 1: return "石头";
            case 2: return "剪刀";
            case 3: return "布";

            default: return "";
        }
    }
}
