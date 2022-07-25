package com.kg.day1;

import com.kg.utils.DBUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * tips:
 * 一个小坑 返回一行记录rs用if ，多行用while
 *   使用Junit和DBUtil来完成emp表的增删改查等操作
 */
public class CRUDDemo {
    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;
    @Before
    public void execBefore(){
        conn = DBUtil.getConnection();
    }
    @After
    public void execAfter(){
        DBUtil.closeConnection(conn,stat,rs);
    }

    @Test
    public void queryAll(){
        try{
            stat = conn.createStatement();
            rs = stat.executeQuery("select * from emp");
            //注意：此时，rs里封装的应该是多行记录。因此游标有一行一行的下移
            while(rs.next()){
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
    public void queryOne(){
        try {
            stat =conn.createStatement();
            rs = stat.executeQuery("select * from testbatch where tid=1");
            if (rs.next()){//一行的话用if
                int tid = rs.getInt(1);
                String tname = rs.getString("tname");
                String tgender = rs.getString(3);
                System.out.println(tid+"\t"+tname+"\t"+tgender);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void addOne(){
        try{
            stat = conn.createStatement();
            //在表最后插入一条数据 zs00 , f
            int num = stat.executeUpdate("INSERT INTO testbatch VALUES(null,'zs00','f')");
            System.out.println("受影响的条数: "+num);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void delOne(){
        try {
            stat = conn.createStatement();
            //将tid=2的数据删除
            int num = stat.executeUpdate("delete from testbatch where tid = 2");
            System.out.println("受影响的条数: "+num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void modifyOne(){
        try {
            stat = conn.createStatement();
            //将tid为3的性别改为m
            int num = stat.executeUpdate("update testbatch set tgender='m' where tid=3");
            System.out.println("受影响的条数: "+num);

        } catch (Exception e) {
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
        try{
            //给stat赋值
            stat = conn.createStatement();
            for (int i = 0; i < 100001; i++) {
                int num = (int)(Math.random()*2);
                String gender = null;
                if(num==0){
                    gender = "f";
                }else {
                    gender = "m";
                }

                String sql = "insert into testbatch values (null,'zs"+i+"','"+gender+"')";
                /**
                 * void addBatch(String sql): 将sql字符串添加到缓存中。
                 */
                stat.addBatch(sql);
                /**
                 * 每1000条一刷新缓存
                 *
                 * executeBatch() :刷新缓存
                 */
                if(i%1000==0){
                    stat.executeBatch();
                }
            }
            //for循环结束后，缓存里可能还有数据啊
            stat.executeBatch();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
