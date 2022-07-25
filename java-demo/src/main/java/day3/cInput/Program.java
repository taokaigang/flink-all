package day3.cInput;

import java.util.Scanner;

/**
 * 控制台输出： System.out.println("hello, world");
 * 控制台输入：
 *      1. 在类的上方，package语句的下方，添加一句话 import java.util.Scanner;
 *      2. Scanner scanner = new Scanner(System.in);
 */
public class Program {
    public static void main(String[] args) {
        // 1. 定义一个变量，用来处理用户的控制台输入
        Scanner scanner = new Scanner(System.in);
        // 2. 使用一些方法，进行控制台的输入
        // String line = scanner.nextLine();       // 等待用户进行控制台的输入，读取输入的一行内容
        // System.out.println(line);

        // int number = scanner.nextInt();         // 读取用户输入的一个整型数字
        // System.out.println(number);

        // float number = scanner.nextFloat();     // 读取用户输入的一个浮点型数字
        // System.out.println(number);

        // char c = scanner.nextLine().charAt(0);  // 读取用户输入的一行内容中的首字符
        // System.out.println(c);
    }
}
