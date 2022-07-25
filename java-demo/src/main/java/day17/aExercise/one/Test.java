package day17.aExercise.one;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        calculate();
    }

    // 设计一个方法，计算从控制台输入的两个数字的和，并处理各种输入的时候的异常
    private static void calculate() {
        // 1. 实例化一个Scanner对象
        Scanner scanner = new Scanner(System.in);

        // 2. 进行控制台的输入
        System.out.println("请输入一个数字:");
        double x = getNumberFromConsole();

        System.out.println("请再输入一个数字:");
        double y = getNumberFromConsole();



        System.out.println("请输入要进行的操作:");
        int choice = -1;
        while (true) {
            System.out.println("1. +\t2. -\t3. *\t4. /");
            try {
                choice = scanner.nextInt();
                // 如果能走到这里，说明这个数字是一个整型数字
                if (choice < 1 || choice > 4) {
                    System.out.println("输入有误，请重新输入");
                }
                else {
                    break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("输入有误，请重新输入!");
                scanner.nextLine();
            }
        }

        switch (choice) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                System.out.println(x / y);
                break;

            default:
                System.out.println("选择有误！");
        }
    }


    /**
     * 获取一个从控制台读取到的double型数据，这里是包含了异常处理的
     * @return 读取到的double类型的数据
     */
    private static double getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        while (true) {
            try {
                x = scanner.nextDouble();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("数字输入有误，请重新输入!");
                scanner.nextLine();//读走换行符（\n）
            }
        }
        return x;
    }
}
