package self.day16.aExercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {
    /**
     * 1. 设计一个方法，计算从控制台输入的两个数字的和，并处理各种输入的时候的异常
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("请输入第一个数字：");
            int a=scanner.nextInt();
            System.out.println("请输入第一个数字：");
            int b=scanner.nextInt();
            System.out.println(sum(a,b));
        }
        catch (InputMismatchException e){//-2147483648 2147483647
            System.out.println("输入超出int范围！");
        }
    }
    private static int sum(int a,int b){
        return a+b;
    }
}
