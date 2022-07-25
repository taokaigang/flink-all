package day12.fInnerClasses.bStaticInnerClass;

import day12.fInnerClasses.bStaticInnerClass.OuterClass.InnerClass;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化静态内部类的对象
        InnerClass innerClass = new InnerClass();

        // 2. 可以通过导包的形式
        // InnerClass innerClass = new InnerClass();

        innerClass.show("aaa");
    }
}
