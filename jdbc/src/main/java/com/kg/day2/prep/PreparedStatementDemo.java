package com.kg.day2.prep;

import com.kg.jdbc.util.DBUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *
 *  学习一下PreparedStatement类型
 *  -1. 此类型是Statement接口的子类型，
 *  -2. 会提前将sql模板发送到DBMS中，由DBMS进行语法的校验和编译，编译后，sql语句的结构不能再被改变
 *  -3. 此类型提供了一个占位符？，来在sql模板上使用。
 *  -4. 此类型提供了相应的方法，给？传值。
 */
public class PreparedStatementDemo {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        conn = DBUtil.getConnection();
        //sql语句中，不用再使用变量进行拼接操作了，而是使用占位符？来给字段的值占位，不能给字段名占位。
        try {
            String sql = "update emp set ename= ?,job=?,mgr = ?,hiredate =?,sal=?,comm=?,deptno=? where empno =?";
            ps = conn.prepareStatement(sql); //此方法会和DBMS进行一次交互，目的是发送sql模板
            /**
             * 给n个占位符进行赋值。
             * PreparedStatement提供了
             * setXXX(int parameterIndex, XXX value)        XXX表示java的某种类型
             * 参数parameterIndex，就是sql模板中的占位符的下标。占位符的下标是从1开始的
             */
            ps.setString(1,"superman10");
            ps.setString(2,"hero");
            ps.setInt(3,7369);

            //获取一个java.sql.Date的实例, Date valueOf(String date), 参数的格式默认是yyyy-MM-dd
            Date hiredate = Date.valueOf("2020-05-19");
            ps.setDate(4,hiredate);
            ps.setDouble(5,500.0);
            ps.setDouble(6,10);
            ps.setInt(7,10);
            ps.setInt(8,9002);


            ps.executeUpdate();//将对应的值发送给DBMS,然后DBMS接收到后，会把相应位置的问号换成具体的值。

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(conn,ps,null);
        }
    }
}
