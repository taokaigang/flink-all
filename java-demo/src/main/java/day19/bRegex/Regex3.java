package day19.bRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 */
public class Regex3 {
    public static void main(String[] args) {
        //
        Pattern pattern = Pattern.compile("(1\\d{2})(\\d{4})(\\d{4})");
        Matcher matcher = pattern.matcher("17788889999");

        // 获取分组的数量
        System.out.println(matcher.groupCount());
        // 获取每一个分组的值之前，先进行整体的匹配
        boolean ret = matcher.matches();
        // 获取到某一个分组的内容
        System.out.println(matcher.group(1));
    }
}
