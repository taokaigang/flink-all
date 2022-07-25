package com.kg.day2.Login;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *
 *  使用修改后的AppServer1进行测试，是否有sql注入问题
 */
public class AppClient1 {
      public static void main(String[] args) {
          String account_id = "6225113088436225";
//          String password = "zgl123456";
          String password = "111111 ' or '1' = '1 "; //测试sql注入问题
          //创建一个服务器AppServer1
          AppServer1 server1 = new AppServer1();
          Account account = server1.checkLogin(account_id, password);
          if (account != null) {
              System.out.println("....正在跳转到主页面....");
          } else {
              System.out.println("....用户名或者是密码错误，请重新输入...");
          }
      }
}
