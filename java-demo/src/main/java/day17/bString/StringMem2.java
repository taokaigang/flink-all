package day17.bString;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description
 */
public class StringMem2 {
    public static void main(String[] args) {
        // 在堆上开辟了一个String对象的空间， 把这个堆上空间的地址给了str1
        // 在堆空间中， 有一个内部的属性， 指向了常量池中的 "hello world"
        String str1 = new String("hello world");

        // 在堆上开辟了一个String对象的空间， 把这个堆上空间的地址给了str2
        // 在堆空间中， 有一个内部的属性， 指向了常量池中的 "hello world"
        String str2 = new String("hello world");

        System.out.println(str1 == str2);		    // false： 因为此时 str1和str2 里面存储的是两块堆空间的地址。
        System.out.println(str1.equals(str2));	    // true: 因为在String类中，已经重写过equals方法了， 重写的实现为比较实际指向的常量池中的字符串。
    }
}
