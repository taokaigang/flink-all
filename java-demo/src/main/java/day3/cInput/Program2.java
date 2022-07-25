package day3.cInput;

import java.util.Scanner;

public class Program2 {
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 从控制台输入一个小写字母，将这个字母转成大写字母
        System.out.println("请输入一个小写字母: ");
        // 读取控制台输入的一个字符
        char c = scanner.nextLine().charAt(0);
        // 将这个字符转成大写
        c -= 32;
        // 输出结果
        System.out.println("字母转成大写后是： " + c);
    }
}
