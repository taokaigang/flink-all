package self.day18aExercise.two;

public class Student {
    private int ID;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Student(String string) {
        String[] split = string.split("#+");
        this.ID = Integer.parseInt(split[0]);
        this.name = split[1];
        this.age = Integer.parseInt(split[2]);
    }

    public void getStudentInfo(String name){
        if (name.equals(this.name)){
            System.out.println(new Student(this.ID, this.name, this.age));
        }

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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
