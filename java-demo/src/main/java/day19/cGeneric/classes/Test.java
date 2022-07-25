package day19.cGeneric.classes;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 实例化一个对象
        // 指定了泛型的类型是 String 类型
        Person<String> xiaoming = new Person<>();
        // 泛型，是在编译前期进行的类型检查。一旦编译完成，泛型就不存在了。
        xiaoming.part = "xiaoming";

        Person<Integer> xiaohong = new Person<>();
        xiaohong.part = 2;

        // 实例化一个子类对象
        Student student = new Student();
        student.part = "abc";

        // 实例化一个泛型子类对象
        Teacher<Integer> xiaowang = new Teacher<>();
        xiaowang.part = 132;

        // 如果多个泛型，使用这个类的时候，逐个进行类型指派即可
        Animal<String, Integer> animal = new Animal<>();

        // 如果对于一个泛型类，在使用的时候，没有指派类型，默认是 Object 类型
        Person xiaobai = new Person();

    }
}

class Animal<T, M> {

}

class Person<T> {
    String name;
    int age;
    T part;     // 虽然现在还不明确T是什么类型，但是我们可以使用这个类型。
}

class Student extends Person<String> {

}

class Teacher<E> extends Person<E> {

}

