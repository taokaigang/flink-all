package com.kg.demo;

import org.junit.Test;

import java.sql.Date;

public class TestDao {
    @Test
    public void testAddEmp(){
        EmpDao dao=DaoFactory.getInstance();
        Emp e=new Emp(9007,"huanghua","manager",7369, Date.valueOf("2019-1-1"),3000,200,20);
        dao.addEmp(e);
    }

}
