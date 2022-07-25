package day6.aExercise;

public class One {
    // 设计⽅法，计算两个⽇期之间相差多少天。两个⽇期的年⽉⽇由参数控制。
    // 1. 计算起始日期，是起始年的第几天
    // 2. 计算截止日期，是截止年的第几天
    // 3. 计算起始年到截止年之间相差多少天
    // 4. 3 + 2 - 1
    public static void main(String[] args) {
        int delta = getDelta(2002, 1, 1, 2020, 4, 2);
        System.out.println(delta);
        int delta1=getDelta(1996,12,16,2020,3,28);
        System.out.println(delta1);
    }

    static int getDelta(int fromYear, int fromMonth, int fromDay, int toYear, int toMonth, int toDay) {
        // 1. 计算起始日期，是起始年的第几天
        int one = getDays(fromYear, fromMonth, fromDay);
        // 2. 计算截止日期，是截止年的第几天
        int two = getDays(toYear, toMonth, toDay);
        // 3. 计算起始年到截止年之间相差多少天
        int three = getDays(fromYear, toYear);
        // 4. 3 + 2 - 1
        return three + two - one;
    }

    /**
     * 计算一个日期，是该年的第几天
     * @param year 年
     * @param month 月
     * @param day 日
     * @return 天数
     */
    static int getDays(int year, int month, int day) {
        // 1. 定义一个变量，用来记录当前共经历的天数
        int days = day;
        // 2. 累加前几个月的天数和
        for (int m = 1; m < month; m++) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                days += 31;
            }
            else if (m == 4 || m == 6 || m == 9 || m == 11) {
                days += 30;
            }
            else {
                // 针对2月份，计算平年闰年
                days += check(year) ? 29 : 28;
            }
        }

        return days;
    }

    /**
     * 计算两年之间相差多少天
     * @param fromYear 起始年
     * @param toYear 截止年
     * @return 相差的天数
     */
    static int getDays(int fromYear, int toYear) {
        // 1. 定义一个变量，用来记录总天数
        int days = 0;
        // 2. 遍历每一年，累加天数  计算到前一年的综合
        for (int y = fromYear; y < toYear; y++) {
            days += check(y) ? 366 : 365;
        }

        return days;
    }

    /**
     * 判断一个年，是平年还是闰年
     * @param year 年
     * @return 验证结果
     */
    static boolean check(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
