package day19.bRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description Pattern和Matcher类的综合使用
 */
public class Regex2 {
    public static void main(String[] args) {
        // 1. 准备一个数据源
        String data = "abc123hello world456lily789lucy012uncle111wang";

        // 2. 将一个字符串变异成正则对象
        Pattern pattern = Pattern.compile("\\d+");

        // 3. 使用一个正则和一个字符串进行校验
        Matcher matcher = pattern.matcher(data);

        // 3.1. 获取整体校验的结果
        // 匹配逻辑：
        //      从第0个字符开始，判断每一个字符是否否则当前的正则。
        //      当找到了有不符合当前正则部分的时候，就会停止继续向后查找，直接返回false
        System.out.println(matcher.matches());

        // 3.2. find()
        while (matcher.find()) {
            System.out.print("匹配到了字符串: " + matcher.group() + ", ");
            System.out.println("下标范围: [" + matcher.start() + ", " + matcher.end() + ")");
        }

        // 3.3. lookingAt()
        System.out.println(matcher.lookingAt() + ", " + matcher.group() + ", [" + matcher.start() + ", " + matcher.end() + ")");
    }
}
