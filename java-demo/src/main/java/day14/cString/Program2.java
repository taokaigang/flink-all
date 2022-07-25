package day14.cString;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 *      字符串类型转基本数据类型
 */
public class Program2 {
    public static void main(String[] args) {
        String str = "10";
        Integer num = Integer.valueOf(str);
        System.out.println(num);

        int num2 = Integer.parseInt("123");

    }
}
