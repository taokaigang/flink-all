package day4.aExercise;

import java.util.Scanner;
public class One {
    // 1. 从控制台输入一个数字，判断这个数字是不是一个水仙花数
    // 核心思路：将一个三位数字中的每一位提取出来
    public static void main(String[] args) {
        // 1. 定义一个Scanner变量
        Scanner scanner = new Scanner(System.in);
        // 2. 从控制台输入一个数字
        int number = scanner.nextInt();
        // 3. 判断这个数字是否是一个三位数字
        if (number >= 100 && number <= 999) {
            // 说明数字是一个三位数字
            // 3.1. 提取出每一位的数字
            int g = number % 10;
            int s = number / 10 % 10;       // int s = number % 100 / 10;
            int b = number / 100;
            // 3.2. 水仙花数的判断
            if (g * g * g + s * s * s + b * b * b == number) {
                System.out.println(number + "是一个水仙花数");
            }
            else {
                System.out.println(number + "不是一个水仙花数");
            }
        }
        else  {
            // 说明数字不是一个三位数字
            System.out.println(number + "不是一个水仙花数");
        }
    }
}
