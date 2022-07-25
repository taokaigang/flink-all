package day15.bCommonClasses;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/11
 * @Description
 *      Calendar类
 */
public class CalendarUsage {
    public static void main(String[] args) {
        // 1. Calendar是一个抽象类，无法直接进行实例化
        Calendar calendar = Calendar.getInstance();

        // 2. 通过指定的字段，获取对应的值。
        //    在 Calendar 类中，已经封装好了若干个静态常量，来表示不同的字段。
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));           // 在Calendar中，月份是从0开始的。
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        // 3. 通过指定的字段，设置对应的值
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.DAY_OF_MONTH, 29);

        // 4. 同时设置年月日
        calendar.set(2021, Calendar.SEPTEMBER, 7);
        //    同时设置年月日时分
        calendar.set(2022, Calendar.NOVEMBER, 12, 23, 59);
        //    同时设置年月日时分秒
        calendar.set(2022, Calendar.NOVEMBER, 12, 23, 59, 59);

        // 5. 获取日期(Date对象)
        Date date = calendar.getTime();
        // 6. 设置日期(Date对象)
        calendar.setTime(new Date());
        // 7. 获取时间戳
        long timestamp = calendar.getTimeInMillis();
        // 8. 设置时间戳
        calendar.setTimeInMillis(timestamp);

        // 9. 判断一个日期是否在另外一个日期之前
        //    类似的方法还有 equals、after
        calendar.before(Calendar.getInstance());

        // 10. 对一个日期进行加法操作
        calendar.add(Calendar.MONTH, 3);
        calendar.add(Calendar.DAY_OF_MONTH, 21);

        System.out.println(calendar);
    }
}
