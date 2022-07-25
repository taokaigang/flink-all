package self.day4.aHomework;

import java.util.Scanner;

/**
 *1、从控制台输入两个英文字母，输出这两个英文字母之间的所有的字母（包含大小写）
 *
* */
public class AAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s1 = scanner.nextLine().charAt(0);

        char s2 = scanner.nextLine().charAt(0);
        if ('a'<=s1 && s1<= 'z') {
            for (int i = s1; i < s2-1; i++) {
                System.out.println((char)(i+1));
            }
        }else if ('A'<=s2 && s2<='Z'){
            for (int i = s1; i < s2-1; i++) {
                System.out.println((char)(i+1));
            }

        }else{
            System.out.println("输入错误，请重试！");
        }

    }
}
