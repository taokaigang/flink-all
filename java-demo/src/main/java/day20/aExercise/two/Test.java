package day20.aExercise.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description
 *【中】设计一个方法，将如下字符串中的所有手机号码和固话号码提取出来，存入一个数组返回。
 *      1. 手机号码的校验: 首位是1，第二位是 3579，后面都是数字
 *      2. 固化校验: 区号-号码，其中区号3或4位，号码7位，且首位不能是0
 */
public class Test {
    public static void main(String[] args) {
        // 1. 数据字符串
        String msg = "17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-9982112";
        // 2. 实例化一个StringBuilder对象，拼接所有的手机号、固定电话号码，拼接之间以 , 分隔
        StringBuilder stringBuilder = new StringBuilder();

        // 2.5. 因为现在需要以数字后面添加一个-作为结尾标识
        if (!msg.endsWith("-")) {
            msg = msg.concat("-");
        }

        // 3. 实例化一个正则
        Pattern pattern = Pattern.compile("(1[3579]\\d{9}|\\d{3,4}-[1-9]\\d{6})-");
        Matcher matcher = pattern.matcher(msg);

        while (matcher.find()) {
            String number = matcher.group();
            stringBuilder.append(number).append(",");
        }

        // x. 将StringBuilder进行切割，得到每一个部分
        String[] array = stringBuilder.toString().split("-,");
        // 遍历数组
        for (String s : array) {
            System.out.println(s);
        }
    }
}
