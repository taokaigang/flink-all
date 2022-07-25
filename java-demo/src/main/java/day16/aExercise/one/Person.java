package day16.aExercise.one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Person {
    private String name;
    private Date birthday;
    private Gender gender;

    public Person(String name, String birthday, Gender gender) {
        this.name = name;
        this.gender = gender;
        // 把指定格式的时间字符串，转成Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        // 姓名: 小明, 生日: 2000年8月6日， 性别: 男
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
        String birthday = sdf.format(this.birthday);

        // 获取性别字符串
        String gender = this.gender.equals(Gender.Male) ? "男" : "女";

        return "姓名: " + this.name + ", 生日: " + birthday + ", 性别: " + gender;
    }
}

enum Gender {
    Male, Female
}