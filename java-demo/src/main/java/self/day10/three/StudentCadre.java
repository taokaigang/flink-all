package self.day10.three;
//  （3）根据学生类，派生一个学生干部类，增加属性：职务；增加方法：开会。
public class StudentCadre extends Student{
    String duty;

    public StudentCadre() {
    }

    public StudentCadre(String name, String gender, int age, String nationality, String school, int ID, String duty) {
        super(name, gender, age, nationality, school, ID);
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "StudentCadre{" +
                "duty='" + duty + '\'' +
                ", school='" + school + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    void conference(){

        System.out.println(name+"是学生干部在开会");
    }
}
