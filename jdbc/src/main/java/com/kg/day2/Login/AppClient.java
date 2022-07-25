package com.kg.day2.Login;

import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *
 * 模拟APP登录的客户端小程序
 *
 */
public class AppClient {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String account_id = sc.next();
        String password = "111111 ' or '1' = '1 ";
        //创建一个服务器
        AppServer server = new AppServer();
        Account account = server.checkLogin(account_id,password);
        if(account!=null){
            System.out.println("....正在跳转到主页面....");
        }else{
            System.out.println("....用户名或者是密码错误，请重新输入...");
        }
    }


  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String account_id = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        //创建一个服务器
        AppServer server = new AppServer();
        Account account = server.checkLogin(account_id,password);
        if(account!=null){
            System.out.println("....正在跳转到主页面....");
        }else{
            System.out.println("....用户名或者是密码错误，请重新输入...");
        }
    }*/
}
