package self.day10.three;
//（1）根据人类，派生一个学生类，增加属性：学校、学号；重写工作方法（学生的工作是学习）。
public class Student extends Person{
    String school;
    int ID;

    public Student() {
    }

    public Student(String name, String gender, int age, String nationality, String school, int ID) {
        super(name, gender, age, nationality);
        this.school = school;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    void work() {

        System.out.println("学生的工作是学习");
    }
}
