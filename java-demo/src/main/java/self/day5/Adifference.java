package self.day5;

/**
 *1. 设计方法，计算两个日期之间相差多少天。两个日期的年月日由参数控制。
 */
public class Adifference {
    public static void main(String[] args) {
//        int d=yearMonthDay(2020,3,27)-yearMonthDay(2020,1,1);
//        System.out.println(d);


    }


//    static int yearMonthDay(int year,int month,int day){
//        // 定义一个变量，用来记录天数
//        int days = day;
//        // 累加前几个月的天数和
//        switch (month) {
//            case 12: days += 30;
//            case 11: days += 31;
//            case 10: days += 30;
//            case 9: days += 31;
//            case 8: days += 31;
//            case 7: days += 30;
//            case 6: days += 31;
//            case 5: days += 30;
//            case 4: days += 31;
//            case 3: days += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
//            case 2: days += 31;
//        }
//        return days;


//    }

    static int getdays(int fromYear,int fromMonth,int fromDay,int toYear,int toMonth,int toDay){


        return 0;
    }

    static int getDays(int fromYear,int toYear){
        int days=0;
        for (int y=fromYear;y<toYear;y++){
            days+=check(y) ? 366:365;
        }
        return days;
    }


    static boolean check(int year){
        return year%4==0&&year%100!=0||year%400==0;
    }

}
