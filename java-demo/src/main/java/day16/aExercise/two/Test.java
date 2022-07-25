package day16.aExercise.two;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Test {
    // 设计一个方法，计算自己来到这个世界多少天了
    private static int getDays(String birthday) {
        // 1. 实例化一个SimpleDateFormat对象，将生日字符串格式化为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 2. 解析字符串，得到Date对象
            Date birth = sdf.parse(birthday);
            // 3. 获取当前时间
            Date now = new Date();
            // 4. 计算时间差
            return (int)((now.getTime() - birth.getTime()) / 1000 / 60 / 60 / 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    private static int getDays(int year, int month, int day) {
        // 用Calendar做
        // 1. 获取一个Calendar对象，描述生日
        Calendar birthday = Calendar.getInstance();
        // 2. 设置年月日
        birthday.set(year, month - 1, day);
        // 3. 获取一个Calendar对象，描述现在
        Calendar now = Calendar.getInstance();
        // 4. 计算时间差
        return (int)((now.getTimeInMillis() - birthday.getTimeInMillis()) / 1000 / 60 / 60 / 24);
    }

    public static void main(String[] args) {
        System.out.println(getDays("2002-04-13"));
        System.out.println(getDays(2002, 4, 13));
    }
}
