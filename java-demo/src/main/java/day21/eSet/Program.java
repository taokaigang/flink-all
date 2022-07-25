package day21.eSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Set集合
        Set<Person> set = new LinkedHashSet<>();

        set.add(new Person("xiaoming", 1));
        set.add(new Person("xiaohong", 2));
        set.add(new Person("xiaoming", 1));
        set.add(new Person("xiaozhang", 5));

        set.forEach(System.out::println);
    }
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
