package day17.bString;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description 关于字符串的内存分析
 */
public class StringMem {
    public static void main(String[] args) {
        Integer s = 20;
        change(s);
        System.out.println(s);      //abc

    }

    private static void change(Integer a) {
        a = 30;
    }
}
