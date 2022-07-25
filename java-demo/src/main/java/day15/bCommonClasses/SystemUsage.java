package day15.bCommonClasses;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/11
 * @Description
 */
public class SystemUsage {
    public static void main(String[] args) {
        // 获取当前系统时间，时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 获取系统时间（纳秒）
        long time2 = System.nanoTime();

        // System.arraycopy();
    }

}
