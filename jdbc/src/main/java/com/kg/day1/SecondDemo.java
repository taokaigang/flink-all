package com.kg.day1;

import com.kg.utils.DBUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 *
 *    写一个查询操作，异常处理标准化
 *
 */
public class SecondDemo {
    public static void main(String[] args){
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try{
            conn = DBUtil.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("select * from emp where empno=7934");
            if(rs.next()){
                int empno = rs.getInt(1);
                String ename = rs.getString("ename");
                String job = rs.getString(3);
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate(5); //java.sql.Date
                double sal = rs.getDouble(6);
                double comm = rs.getDouble(7);
                int deptno = rs.getInt(8);
                System.out.println(empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(conn,stat,rs);
        }
    }



    /*public static void main(String[] args){
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nz202","root","mmforu");
            stat = conn.createStatement();
            //发送sql语句，获取结果集
            rs = stat.executeQuery("select * from emp where empno=7934");
            //处理结果集，从结果集取出数据，进行打印
            // 最开始时，游标出于第一行的前面，next方法是用于向下移动游标的，返回值是boolean类型，如果有下一行，返回true,并移动
            if(rs.next()){
                //如果进到分支结构中，说明游标当前处于第一行上。我们就可以解析第一行的数据了
                int empno = rs.getInt(1);
                String ename = rs.getString("ename");
                String job = rs.getString(3);
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate(5); //java.sql.Date
                double sal = rs.getDouble(6);
                double comm = rs.getDouble(7);
                int deptno = rs.getInt(8);
                System.out.println(empno+"\t"+ename+"\t"+job);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
          try{
              //finally通常用于释放资源
              rs.close();
              stat.close();
              conn.close();
          }catch (Exception e){
              e.printStackTrace();
          }
        }
    }*/
}
