package day11.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Student extends Person {
    private String school;
    private String id;

    public Student(String name, int age, char gender, String country, String school, String id) {
        super(name, age, gender, country);
        this.school = school;
        this.id = id;
    }

    public Student() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void work() {
        System.out.println(this.getName() + "学生在学习...");
    }
}
