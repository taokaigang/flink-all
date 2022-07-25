package com.kg.demo;

import java.util.List;

public interface EmpDao {

    /**
     * 添加
     * @param emp
     */
    void addEmp(Emp emp);

    /**
     * 通过id删除
     * @param empno
     */
    void deleteById(int empno);

    /**
     * 修改
     * @param emp
     */
    void modifyEmp(Emp emp);

    /**
     * 通过id返回emp对象
     * @param empno
     */
    Emp findById(int empno);

    /**
     * 查询所有记录
     * @return
     */
    List<Emp> findAll();


}
