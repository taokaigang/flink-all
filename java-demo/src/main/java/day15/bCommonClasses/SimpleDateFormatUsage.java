package day15.bCommonClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/11
 * @Description
 */
public class SimpleDateFormatUsage {
    public static void main(String[] args) {
        // format();
        // parse();
        System.out.println(getDeltaDays("2002-09-28", "2020-04-11"));
    }

    // 将一个时间对象，转成指定格式的字符串
    private static void format() {
        // 1. 获取系统当前时间
        Date now = new Date();
        // 2. 指定一个时间格式，例如： 2020年4月11日 18:09:49
        String format = "yyyy年M月d日 HH:mm:ss";
        // 3. 通过一个时间格式，实例化一个SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        // 4. 转换成指定格式的字符串
        String str = sdf.format(now);
        System.out.println(str);
    }

    // 将一个指定格式的字符串，转成时间对象
    private static void parse() {
        // 1. 通过一个时间格式，实例化一个对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 2. 将一个指定格式的字符串，解析成Date对象
        try {
            Date date = sdf.parse("2019-09-27 22:18:05");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // 小练习：设计方法，计算两个日期之间相差多少天
    private static int getDeltaDays(String from, String to) {
        // 1. 限定一个时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 2. 将两个时间转成Date对象
        try {
            Date fromDate = sdf.parse(from);
            Date toDate = sdf.parse(to);

            // 3. 计算相差多少天
            long days = (toDate.getTime() - fromDate.getTime()) / 1000 / 60 / 60 / 24;
            return (int)Math.abs(days);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
