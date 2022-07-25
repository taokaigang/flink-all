package com.kg.day1;

import com.kg.utils.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *
 *  JDBC的第一个入门案例的编写：删除操作，
 */
public class FirstDemo {
    /**
     * 使用DBUtil工具类，来去掉重复代码
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 获取连接
        Connection conn = DBUtil.getConnection();
        Statement stat = conn.createStatement();
        String sql = "delete from emp where empno = 9001";
        int num = stat.executeUpdate(sql);// 调用执行DML操作的方法 executeUpdate(String sql);
        System.out.println("受影响的条数："+num);

        //关闭连接
        DBUtil.closeConnection(conn,stat,null);
    }



    /*public static void main(String[] args) throws Exception {
        //第一步：利用反射机制，加载mysql的驱动类型 com.mysql.jdbc.Driver到内存中
        Class.forName("com.mysql.jdbc.Driver");
        *//**
         * 第二步：获取连接对象
         * getConnection(String url,String user,String passwd)
         * url:指的是连接数据库的一个路径。
         *     如果连接的是mysql,路径应该是：jdbc:mysql://ip:port/dbname
         * user: 数据库的用户名
         * passwd: 数据库用户名对应的密码
         *//*
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nz202","root","mmforu");
        //第三步：获取执行sql语句的执行对象Statement实例
        Statement stat = conn.createStatement();
        //第四步：发送sql语句
        String sql = "delete from emp where empno = 9001";
        int num = stat.executeUpdate(sql);// 调用执行DML操作的方法 executeUpdate(String sql);
        //打印一下数据库里有几条受影响
        System.out.println("受影响的条数："+num);
        //最后一步：关闭连接
        stat.close();
        conn.close();
    }*/
}
