package com.kg.day2.Login;

import com.kg.jdbc.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *
 * 模拟服务端接收客户端的用户账号和密码，然后使用jdbc将
 * 来查询表中是否有此用户名和密码对应的记录，如果有，就将返回的记录封装成一个
 * Account类型的对象
 */
public class AppServer {
    public Account checkLogin(String accountId,String password){
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        Account account = null;
        try {
            conn = DBUtil.getConnection();
            stat = conn.createStatement();
            String sql = "select id,account_id,account_balance,user_name,user_idcard,gender from bank_account where account_id='"+accountId+"' and user_pwd='"+password+"'";
            rs = stat.executeQuery(sql);
            //如果数据库里有这样的用户账号和密码，那么一定会返回一条记录
            if(rs.next()){
                int id = rs.getInt("id");
                double balance = rs.getDouble("account_balance");
                String realName = rs.getString("user_name");
                String idcard = rs.getString("user_idcard");
                String gender = rs.getString("gender");
                account = new Account(id,accountId,balance,realName,null,idcard,null,gender);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(conn,stat,rs);
        }
        return account;
    }
}
