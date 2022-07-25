package day10.cOverride;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Person {
    int age = 10;
}

class Student extends Person {
    int age = 20;

    public void show() {
        int age = 30;

        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}

class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.show();
    }
}


