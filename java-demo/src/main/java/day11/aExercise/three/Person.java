package day11.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Person {
    private String name;
    private int age;
    private char gender;
    private String country;

    public Person() {
    }

    public Person(String name, int age, char gender, String country) {
        this.name = name;
        this.setAge(age);
        this.setGender(gender);
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == '男' || gender == '女') {
            this.gender = gender;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void eat() {}
    public void sleep() {}
    public void work() {}
}
