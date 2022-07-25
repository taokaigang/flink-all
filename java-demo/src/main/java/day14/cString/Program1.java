package day14.cString;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 *      基本数据类型转成字符串类型
 */
public class Program1 {
    public static void main(String[] args) {
        // 将一个基本数据类型的数据，转成字符串
        String str1 = String.valueOf(10);
        System.out.println(str1);

        String str = Integer.valueOf(10).toString();

        String str2 = Integer.toString(1);

    }
}
