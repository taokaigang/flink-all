package self.day10.three;
//定义一个人类，包括属性：姓名、性别、年龄、国籍；包括方法：吃饭、睡觉，工作。
public class Person {
    String name;
    String gender;
    int age;
    String nationality;

    public Person() {
    }

    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    void eat(){
        System.out.println(name+"在吃饭");
    }
    void sleep(){
        System.out.println(name+"在睡觉");
    }
    void work(){
        System.out.println(name+"在工作中");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
