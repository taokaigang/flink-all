package day17.bString;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description
 */
public class StringMem3 {
    public static void main(String[] args) {
        // 字符串的内存
        String s1 = "hello" + "world";
        String s2 = "helloworld";
        System.out.println(s1 == s2);


        String s3 = "hello";
        String s4 = s3 + "world";
        System.out.println(s4 == s2);
        System.out.println(s4.equals(s2));
    }
}
