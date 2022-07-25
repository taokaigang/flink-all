package self.day15.aExercise.two;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Two {
    /**
     * 2. 设计一个方法，计算自己来到这个世界多少天了
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(getDeltaDays("2000-01-01","2020-4-11"));

    }

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
