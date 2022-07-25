package com.kg.day2.Login;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Description
 * 为表bank_account设计一个实体类型，也就是表的字段与java类型的属性的映射关系
 */
public class Account {
    //提供属性
    private int id;
    private String account_id;
    private double balance;
    private String realName;
    private String password;
    private String idcard;
    private Timestamp timestamp;
    private String gender;
    //提供无惨构造器
    public Account(){}
    //提供全参构造器

    public Account(int id, String account_id, double balance, String realName, String password, String idcard, Timestamp timestamp, String gender) {
        this.id = id;
        this.account_id = account_id;
        this.balance = balance;
        this.realName = realName;
        this.password = password;
        this.idcard = idcard;
        this.timestamp = timestamp;
        this.gender = gender;
    }
    //为属性提供get/set方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //提供equal方法和hashCode方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Double.compare(account.balance, balance) == 0 &&
                Objects.equals(account_id, account.account_id) &&
                Objects.equals(realName, account.realName) &&
                Objects.equals(password, account.password) &&
                Objects.equals(idcard, account.idcard) &&
                Objects.equals(timestamp, account.timestamp) &&
                Objects.equals(gender, account.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account_id, balance, realName, password, idcard, timestamp, gender);
    }
    public String toString(){
        return account_id+"\t"+balance+"\t"+realName;
    }
}
