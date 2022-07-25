package com.kg.exercise;

import com.kg.day2.Login.Account;

public class AppClient {
    public static void main(String[] args) {
        String account_id = "7369";
        String password = "111111 ' or '1' = '1 "; //测试sql注入问题
        //创建一个服务器AppServer
        AppServer server = new AppServer();
        Account account = server.checkLogin(account_id, password);
        if (account != null) {
            System.out.println("....正在跳转到主页面....");
        } else {
            System.out.println("....用户名或者是密码错误，请重新输入...");
        }
    }
}
