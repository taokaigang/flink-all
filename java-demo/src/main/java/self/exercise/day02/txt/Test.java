package self.exercise.day02.txt;

public class Test {
    public static void main(String[] args) {
        //继承
        Student s1=new QphoneStudent();
        s1.study();
        Student s2=new SmallStudent();
        Student s3=new QphoneStudent(s2);
        s2.study();
    }
}
