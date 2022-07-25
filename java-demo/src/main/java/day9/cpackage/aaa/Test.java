// 定义当前这个文件在哪一个包里面
package day9.cpackage.aaa;

import day9.cpackage.bbb.BClass;    // 导入一个指定的类
import day9.cpackage.bbb.*;         // 导入这个包下面的所有的类

// 如果一个类，需要被跨包使用，那么这个类的访问权限一定是 public

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 想使用 bbb 包中的 BClass 类
        // 如果需要使用其他包中的类，
        // 1. 使用类的全限定名: 从最外层的包开始，逐层向内查找，直到找到这个包。
        // day9.cpackage.bbb.BClass cls = new day9.cpackage.bbb.BClass();

        // 2. 使用导包的方式
        // BClass cls = new BClass();

        // 3. 如果导入的多个包中，有重名的类，为了区分不同的类，即便导包了，依然需要使用类的全限定名访问。

    }
}
