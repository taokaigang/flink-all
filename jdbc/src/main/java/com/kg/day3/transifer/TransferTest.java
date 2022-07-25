package com.kg.day3.transifer;

import com.kg.jdbc.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *
 *  简单的写一个转账客户端
 */
public class TransferTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入转出账号和转入账号");
        String fromAccount = sc.next();
        String toAccount = sc.next();
        System.out.println("请输入要转出的金额");
        double money = sc.nextDouble();
        boolean success = oneToOne(fromAccount,toAccount,money);
        if(success){
            System.out.println("-----成功-------");
        }else{
            System.out.println("-----失败-------");
        }

    }

    /**
     *  定义一个转账的方法
     * @return true,表示转账成功
     *         false，表示失败
     *
     *   fromAccount :转出账号
     *   toAccount :转入账号
     *   money: 转出的金额
     */
    public static boolean oneToOne(String fromAccount,String toAccount,double money){
        if (fromAccount==null||fromAccount.length()==0){
            return false;
        }
        if(toAccount==null||toAccount.length()==0){
            return false;
        }
        if(money<=0){
            return false;
        }


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = DBUtil.getConnection();

            //在此处，取消事务的自动提交操作，也就是手动开启一个事务
            conn.setAutoCommit(false);//true表示自动提交



            //第一步：判断两个账号是否存在
            String sql ="select * from bank_account where account_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,fromAccount);
            rs = ps.executeQuery();
            if(!rs.next()){
                System.out.println("-----转出账号不存在-------");
                return false;
            }
            // 账号存在，那么就保留一下账号的余额
            double balance = rs.getDouble("account_balance");


            ps.setString(1,toAccount);
            rs = ps.executeQuery();
            if(!rs.next()){
                System.out.println("-----转入账号不存在-------");
                return false;
            }
            //到此为止，账号正常，需要查看转出账号的余额是否充足
            if(balance<money){
                System.out.println("-----转出账号余额不足-------");
                return false;
            }

            //到此为止，说明余额是充足，那么就可以进行扣款操作
            String sql1 = "update bank_account set account_balance=account_balance+? where account_id = ?";
            ps = conn.prepareStatement(sql1);//重新发送模板
            ps.setDouble(1,-money);
            ps.setString(2,fromAccount);
            ps.executeUpdate();

            //模拟一个异常操作
            String str = null;
            System.out.println(str.length());


            //到此之后，转入账号应该入账
            ps.setDouble(1,money);
            ps.setString(2,toAccount);
            ps.executeUpdate();

            //改为手动提交事务
            conn.commit();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            //如果中途出现了异常，应该回滚到事务之初
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }finally {
            DBUtil.closeConnection(conn,ps,rs);
        }
        return false;
    }
}







