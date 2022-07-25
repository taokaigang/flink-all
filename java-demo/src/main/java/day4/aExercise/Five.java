package day4.aExercise;

import java.util.Scanner;

/**
 * 控制台输入，其实是将输入的内容，全部放到了一个“缓冲区”，使用方法读取输入内容的时候，其实是从“缓冲区”中读取的。
 *
 * nextLine(): 从缓冲区中读取一行数据，读取到换行符结束。 \n
 * next(): 从缓冲区中读取一个单词字符串，读取到一个换行符或者一个就结束。（会读取走空格以及换行符）
 * nextInt()、nextFloat()、nextDouble()... : 使用next()方法读取到一个字符串，将读取到的字符串转成指定的数据类型的结果
 */

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("请输入一个数字");
        int num = scanner.nextInt();                // \n
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        System.out.println("!"+num+"!");
//        System.out.println("!"+num2+"!");
//        System.out.println("!"+num3+"!");
        scanner.next();
        System.out.println("请输入一个字符串");
        String str = scanner.nextLine();
        System.out.println("----------------");

        System.out.println(num);
        System.out.println("!" + str + "!");
    }
}
