package day16.cException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Handle6 {
    public static void main(String[] args) {
        try {
            test2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void test2() throws ParseException {
        test();
    }

    // throws ParseException:
    // 1. 告诉调用方，这个方法有一个异常，在使用的时候，需要注意。
    // 2. 在这个方法中，如果遇到了ParseException异常，可以不去处理，谁调用这个方法谁处理。
    private static void test() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 将一个指定格式的时间字符串，解析为一个Date对象
        Date date = sdf.parse("2000-01-01");
        System.out.println(date);
    }
}
