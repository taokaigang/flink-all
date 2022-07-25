package day3.eSwitch;

public class Switch3 {
    // 通过利用switch的穿透性，解决：计算一个年月日，是该年的第几天
    public static void main(String[] args) {
        // 定义三个变量，分别来表示年月日
        int year = 2020, month = 12, day = 31;
        // 定义一个变量，用来记录天数
        int days = day;

        // 累加前几个月的天数和
        switch (month) {
            case 12: days += 30;
            case 11: days += 31;
            case 10: days += 30;
            case 9: days += 31;
            case 8: days += 31;
            case 7: days += 30;
            case 6: days += 31;
            case 5: days += 30;
            case 4: days += 31;
            case 3: days += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
            case 2: days += 31;
        }
        System.out.println(days);
    }
}
