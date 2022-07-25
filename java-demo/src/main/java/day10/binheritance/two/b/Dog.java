package day10.binheritance.two.b;

import day10.binheritance.two.a.Animal;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Dog extends Animal {

    public void display() {
//        System.out.println(this.privateField);    // 私有权限，在跨包子类中不能访问
//        System.out.println(this.defaultField);    // 默认权限，在跨包子类中不能访问
        System.out.println(this.protectedField);
        System.out.println(this.publicField);
    }
}
