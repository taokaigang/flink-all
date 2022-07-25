package com.kg.day1;

import com.kg.utils.C3p0Utils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) {

    }

    /**
     *   使用Junit和DBUtil来完成emp表的增删改查等操作
     */
    public class CRUDDemo {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        @Before
        public void execBefore(){
            conn = C3p0Utils.getConnection();
        }
        @After
        public void execAfter(){
            C3p0Utils.closeConnection(conn,stat,rs);
        }

        @Test
        public void queryAll(){
            //.............
        }
        @Test
        public void queryOne(){
            try{
                stat = conn.createStatement();
                rs = stat.executeQuery("select * from emp where empno=7369");
                //注意：此时，rs里封装的应该是多行记录。因此游标有一行一行的下移
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
            }
        }
        @Test
        public void addOne(){
            try{
                stat = conn.createStatement();
                int num = stat.executeUpdate("insert into emp values (9001,'superman','salesman',7369,'2020-10-10',2000.0,10.0,20)");
                System.out.println("受影响的条数："+num);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        @Test
        public void delOne(){
            try{
                stat = conn.createStatement();
                int num = stat.executeUpdate("delete from emp where empno = 9001");
                System.out.println("受影响的条数："+num);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        @Test
        public void modifyOne(){
            try{
                stat = conn.createStatement();
                int num = stat.executeUpdate("update emp set ename= 'clark',job = 'reporter' where empno = 9001");
                System.out.println("受影响的条数："+num);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        /**
         * 研究一下Statement类型的批量操作
         * 想向数据库nz202下的testbatch表中插入10w记录中
         *
         * 原理：批量插入数据时，可以减少与数据库的交互次数，从而提高性能，减少时间。
         */
        @Test
        public void testBatch(){
            //.....
        }
    }
}
