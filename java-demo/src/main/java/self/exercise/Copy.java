package self.exercise;

public class Copy {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher("zhangsan", 18);
        Teacher teacher2=teacher;

        System.out.println(teacher);
        System.out.println(teacher2);

        Teacher teacher3 = (Teacher) teacher.clone();

        System.out.println(teacher3);
    }

}
