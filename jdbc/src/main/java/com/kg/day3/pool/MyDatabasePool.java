package com.kg.day3.pool;

import java.sql.*;
import java.util.LinkedList;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *    连接池对象里应该存储多个Connection对象，因此
 *    应该提供一个集合属性
 *
 *    使用单例模式
 */
public class MyDatabasePool {
    private static LinkedList<Connection> list;
    private static MyDatabasePool  pool;

    //使用静态块，给集合属性赋值，同时初始化5个连接对象
    static{
        list = new LinkedList<>();
        int i = 0;
        while(i<5){
            //先创建一个Connection对象，
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nz202","root","mmforu");
                list.add(new MyConnection(conn,list));
                i++;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    private MyDatabasePool(){
    }
    public static MyDatabasePool getInstance(){
        if(pool==null){
            return new MyDatabasePool();
        }
        return null;
    }

    /**
     * 从连接池中获取对象。
     * @return
     */
    public  Connection getConnection(){

        if(list.size()<=0){
            throw new RuntimeException("--连接池中已经没有空闲对象了-");
        }
        System.out.println("------连接中的剩余个数："+list.size()+",可以获取一个");
        return list.removeFirst();

    }

    public static void main(String[] args) throws SQLException {
        MyDatabasePool pool = MyDatabasePool.getInstance();
        Connection conn = pool.getConnection(); //此连接对象时从池子中获取的，类型是MyConnection;
        PreparedStatement ps =conn.prepareStatement("select * from emp where empno = 7369");
        ResultSet rs = ps.executeQuery();
        System.out.println(rs.next());



        Connection conn1 = pool.getConnection(); //此连接对象时从池子中获取的，类型是MyConnection;
        PreparedStatement ps1 =conn1.prepareStatement("select * from emp where empno = 7369");
        ResultSet rs1 = ps1.executeQuery();
        System.out.println(rs1.next());


        Connection conn2 = pool.getConnection(); //此连接对象时从池子中获取的，类型是MyConnection;
        PreparedStatement ps2 =conn2.prepareStatement("select * from emp where empno = 7369");
        ResultSet rs2 = ps2.executeQuery();
        System.out.println(rs2.next());

        Connection conn3 = pool.getConnection(); //此连接对象时从池子中获取的，类型是MyConnection;
        PreparedStatement ps3 =conn3.prepareStatement("select * from emp where empno = 7369");
        ResultSet rs3 = ps3.executeQuery();
        System.out.println(rs3.next());

        Connection conn4 = pool.getConnection(); //此连接对象时从池子中获取的，类型是MyConnection;
        PreparedStatement ps4 =conn4.prepareStatement("select * from emp where empno = 7369");
        ResultSet rs4 = ps4.executeQuery();
        System.out.println(rs4.next());

        conn.close();//释放连接对象，归还给连接池
        conn1.close();//释放连接对象，归还给连接池
        conn2.close();//释放连接对象，归还给连接池
        conn3.close();//释放连接对象，归还给连接池
        conn4.close();//释放连接对象，归还给连接池

        Connection conn5 = pool.getConnection(); //此连接对象时从池子中获取的，类型是MyConnection;
        PreparedStatement ps5 =conn5.prepareStatement("select * from emp where empno = 7369");
        ResultSet rs5 = ps5.executeQuery();
        System.out.println(rs5.next());
        conn5.close();//释放连接对象，归还给连接池
    }
}
