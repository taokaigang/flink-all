package day15.bCommonClasses;

import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/11
 * @Description Date日期类
 */
public class DateUsage {
    public static void main(String[] args) {
        // 1. 实例化一个Date对象
        Date date = new Date();

        // 2. 获取一个日期的对应的时间戳 (从 1970年 1月 1日 0时开始的毫秒数)
        long timestamp = date.getTime();

        // 3. 实例化一个Date对象
        Date date1 = new Date(1586587414273L);
        System.out.println(date1);

        // 通过设置一个时间戳，修改这个对象描述的时间
        date1.setTime(1586587414273L);

        System.out.println(date.equals(date1));     // 判断两个时间是否相同
        System.out.println(date.before(date1));     // 判断一个时间是否在另一个时间之前
        System.out.println(date.after(date1));      // 判断一个时间是否在另一个时间之后
    }
}
