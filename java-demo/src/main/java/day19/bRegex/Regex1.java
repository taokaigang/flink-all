package day19.bRegex;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description Pattern类 和 Matcher类
 */
public class Regex1 {
    public static void main(String[] args) {
        // 1. 静态的校验
        boolean ret = Pattern.matches("[1-9]\\d{5,10}", "123456");
        System.out.println(ret);

        // 2. 将一个字符串编译为正则表达式对象(Pattern对象)
        Pattern pattern = Pattern.compile(" +");
        // 3. 字符串切割
        String[] array1 = pattern.split("Lily     Lucy    Polly     Jim     Tom");
        System.out.println(Arrays.toString(array1));

        String[] array2 = pattern.split("Lily     Lucy    Polly     Jim     Tom", 0);
        System.out.println(Arrays.toString(array2));
    }
}
