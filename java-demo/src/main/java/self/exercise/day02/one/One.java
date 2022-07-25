package self.exercise.day02.one;

import day26.cScanner.SystemOutTest;

import java.util.Scanner;

public class One {
    //1. 写一个登录注册的字符串界面，要求注册的用户可用于登录，登录之后程序结束。
    //   如果用户名和密码输入错误，那么会有3次机会再次输入，如果机会用完，程序结束。
    public static void main(String[] args) {
        UI();
    }

    private static void UI(){
        System.out.println("欢迎来到登录界面");
        System.out.println("请选择 1.登录 2.注册 ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice){
            case 1:

                break;
            case 2:
                break;
            default:
                System.out.println("输入错误！！！");
        }
    }




}
