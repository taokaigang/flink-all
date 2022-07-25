package day4.aExercise;

import java.util.Scanner;

public class Four {
    // 使用switch完成一个迷你计算器，从控制台输入要参与运算的数字，以及要进行的运算，输出结果
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 输入一个操作数
        System.out.println("请输入一个数字：");
        int num1 = scanner.nextInt();
        // 2. 再输入一个操作数
        System.out.println("请再输入一个数字：");
        int num2 = scanner.nextInt();

        scanner.nextLine();//把换行符读走

        // 3. 输入一个操作符
        System.out.println("请输入要进行的操作");
        char operator = scanner.nextLine().charAt(0);
        // 4. 定义一个变量，用来记录运算的结果
        int result = 0;
        // 5. 根据输入的不同的运算符，对两个数字进行运算
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("输入的运算符有误，无法完成运算");
        }
        // 6. 输出结果
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
