package day15.aExercise;

import java.util.Scanner;

/**
 * @Description 双色球用户交互设计
 */
public class UI {

    private static Scanner scanner = new Scanner(System.in);

    // 开启交互
    public static void start() {
        while (true) {
            System.out.println("请输入要进行的操作：");
            System.out.println("1. 自选号码    2. 机选号码");

            // 声明一注双色球，作用用户的选择的双色球
            Ball ball = null;

            int choice = scanner.nextInt();
            if (choice == 1) {
                // 自选号码
                ball = getCustomBall();
            }
            else if (choice == 2) {
                // 机选号码
                ball = new Ball();
            }
            else {
                continue;
            }

            // 生成中奖的号码
            Ball correct = new Ball();
            // 对比自己的双色球和中奖号码，得出奖项等级
            int level = correct.getTicketLevel(ball);
            // 计算中奖金额
            int money = TicketPool.getMoney(level);
            // 输出结果
            System.out.println("您的选择是: " + ball);
            System.out.println("中奖号码是: " + correct);
            if (money == 0) {
                System.out.println("很遗憾，本期未中奖，期待下一期再接再厉！");
            }
            else {
                System.out.println("恭喜!!! 本期中了" + level + "等奖, 中奖金额为: " + money + "元");
            }
        }
    }

    // 获取一注自选的双色球
    private static Ball getCustomBall() {
        // 1. 实例化一个红球数组
        int[] redBalls = new int[6];
        // 2. 循环输入
        System.out.println("请输入红球: ");
        for (int i = 0; i < redBalls.length; i++) {
            redBalls[i] = scanner.nextInt();
        }

        // 3. 蓝球输入
        System.out.println("请输入蓝球: ");
        int blueBall = scanner.nextInt();

        return new Ball(redBalls, blueBall);
    }
}
