package self.exercise.day02.txt;

public class QphoneStudent extends Student {
    private Student student;

    public QphoneStudent() {
    }

    public QphoneStudent(Student student) {
        this.student = student;
    }

    @Override
    public void study() {
        super.study();
        System.out.println("java");
    }
}
