package day5.aExercise;

import java.util.Scanner;

public class One {
    // 从控制台输入两个英文字母，输出这两个英文字母之间的所有的字母（包含大小写）
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        // 1. 比较两个字符，求出最大值和最小值
        char max, min;
        if (a > b) {
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }

        // 2. 循环遍历两个字母之间是所有的字母
        for (char c = min; c <= max; c++) {
            /*if (c > 'Z' && c < 'a') {
                continue;
            }*/

            if('Z'<c && c<'a') {
                continue;//排除大写和小小写字母之间的
            }
            System.out.println(c);
        }
    }
}
