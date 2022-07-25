package com.kg.exercise;

import com.kg.day2.Login.Account;
import com.kg.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppServer {
    String sql = "select id,account_id,account_balance,user_name,user_idcard,gender from bank_account where account_id=? and user_pwd=?";
    public Account checkLogin(String accountId, String password){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Account account = null;
        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql); //将sql模板发送到DBMS里
            //给问号赋值，
            ps.setString(1,accountId);
            ps.setString(2,password);
            //发送数据
            rs = ps.executeQuery();
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
            DBUtil.closeConnection(conn,ps,rs);
        }
        return account;
    }
}
