package day4.aExercise;

import java.util.Scanner;

public class Two {
    // 从控制台输入一个字符，如果这个字符是大写字母，转成小写字母输出；如果这个字符是小写字母，转成大写字母输出；如果不是字母，原义输出。
    public static void main(String[] args) {
        // 1. 从控制台输入一个字母
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        // 2. 判断这个字符是不是大写字母
        if (c >= 'A' && c <= 'Z') {
            // 将大写转小写输出
            System.out.println((char)(c + 32));
        }
        else if (c >= 'a' && c <= 'z') {
            // 将小写转大写输出
            System.out.println(c -= 32);
        }
        else {
            // 说明不是字母
            System.out.println("不是字母");
        }
    }
}
