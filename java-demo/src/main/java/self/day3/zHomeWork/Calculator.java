package self.day3.zHomeWork;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int i = scanner.nextInt();
        System.out.println("请输入另一个数字：");
        int j = scanner.nextInt();

        System.out.println("请输入要进行的运算：");
        char s = scanner.next().charAt(0);
        switch (s){
            case '+':
                System.out.println(i+j);
                break;
            case '-':
                System.out.println(i-j);
                break;
            case '*':
                System.out.println(i*j);
                break;
            case '/':
                System.out.println(i/j);
                break;
            case '%':
                System.out.println(i%j);
                break;
            default:
                System.out.println("暂时不能计算");
                break;
        }
    }
}
