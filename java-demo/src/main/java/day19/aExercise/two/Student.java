package day19.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 */
public class Student {
    private String id;
    private String name;
    private int age;

    public Student(String info) {
        // 1. 按照 # 切割出每一个属性
        String[] parts = info.split("#");
        // 2. 给每一个属性赋值
        this.id = parts[0];
        this.name = parts[1];
        this.age = Integer.parseInt(parts[2]);
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
