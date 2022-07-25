package self.day3.zHomeWork;

import java.util.Scanner;
public class AToa_aToA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字母：");
        char ch=scanner.nextLine().charAt(0);
        if('a'<=ch && ch<='z'){
            ch -= 32;
            System.out.println(ch);
        }else if('A'<=ch && ch<='Z'){
            ch +=32;
            System.out.println(ch);
        }else {
            System.out.println(ch);
        }
    }
}
