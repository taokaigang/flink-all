package self.day15.aExercise.one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    //private String date;
    private Date date;
    private Gender gender;

    public Person(String name, String date, Gender gender) {
        this.name = name;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.date = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.gender = gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
        // 姓名: 小明, 生日: 2000年8月6日， 性别: 男
        return "姓名：" + name +
                ", 生日：" + sdf.format(date) +
                ", 性别：" + getGender()
                ;
    }

    public String getGender() {
        //return gender;
        if (this.gender==Gender.Male){
            return "男";
        }else {
            return "女";
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /*public Person(String name, String date , Gender gender) {
        this.name = name;
        setDate(date);
        this.gender = gender;
    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年M月d日");
        try {
            //Date date0 = sdf.parse(this.date);
            //return sdf2.format(date0);
            return sdf2.format(sdf.parse(this.date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //Date date0 = sdf.parse(date);
            //this.date=sdf.format(date0);
            this.date=sdf.format(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        // 姓名: 小明, 生日: 2000年8月6日， 性别: 男
        return "姓名：" + name +
                ", 生日：" + getDate() +
                ", 性别：" + getGender()
                ;
    }*/
}
