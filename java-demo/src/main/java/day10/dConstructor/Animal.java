package day10.dConstructor;

import com.sun.org.glassfish.external.amx.AMX;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Animal {
    String name;
    int age;
    char gender;

//    public Animal() {
//        System.out.println("Animal类的无参构造方法执行了");
//    }
    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Dog extends Animal {
    String furColor;

    // There is no default constructor available in 'day10.dConstructor.Animal'
    public Dog() {
        super("aa", 1, 'a');
        System.out.println("Dog类的无参构造方法执行了");
    }

    public Dog(String name, int age, char gender) {
        super(name, age, gender);
    }
}

class AnimalTest {
    public static void main(String[] args) {
        // 1. 实例化一个Dog类的对象
        Dog dog = new Dog();

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.gender);

        // 2.
        Dog xiaobai = new Dog("xiaobai", 1, 'm');
    }
}
