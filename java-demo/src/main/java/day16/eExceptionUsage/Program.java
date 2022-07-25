package day16.eExceptionUsage;

import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 控制台输入
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入红球: ");
            int[] array = new int[6];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("请输入蓝球: ");
            int blue = scanner.nextInt();

            // 实例化一注双色球
            try {
                Ball ball = new Ball(array, blue);
                System.out.println(ball);
            }
            catch (Ball.WrongNumberException e) {
                // 说明号码是有误的，重新输入：
                System.err.println(e.getMessage() + ", 请重新输入!");
            }
        }

    }
}
