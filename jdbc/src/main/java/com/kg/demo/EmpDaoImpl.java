package com.kg.demo;

import com.kg.utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EmpDaoImpl implements EmpDao{

    public void addEmp(Emp emp) {
        Connection conn=null;
        PreparedStatement ps=null;
       try{

           conn= DruidUtils.getConnection();
           String sql="insert into emp values (?,?,?,?,?,?,?,?)";
           ps=conn.prepareStatement(sql);

           ps.setInt(1, emp.getEmpno());
           ps.setString(2, emp.getEname());
           ps.setString(3, emp.getJob());
           ps.setInt(1, emp.getEmpno());
           ps.setInt(4, emp.getMgr());
           ps.setDate(5, emp.getHiredate());
           ps.setDouble(6, emp.getSalary());
           ps.setDouble(7, emp.getComm());
           ps.setInt(8, emp.getDeptno());
           ps.executeUpdate();

       }catch (Exception e){
           e.printStackTrace();
       }


    }


    public void deleteById(int empno) {

    }


    public void modifyEmp(Emp emp) {

    }

    public Emp findById(int empno) {
        return null;
    }


    public List<Emp> findAll() {
        return null;
    }
}
