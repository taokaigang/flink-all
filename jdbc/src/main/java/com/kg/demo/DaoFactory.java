package com.kg.demo;

public class DaoFactory {
    private static EmpDao empDao=new EmpDaoImpl();
    private DaoFactory(){}
    public synchronized static EmpDao getInstance(){
        return empDao;
    }
}
