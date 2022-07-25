package day26.eObjectStream;

import java.io.Serializable;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/26
 * @Description
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private int score;

    private Rabbit rabbit;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


class Rabbit implements Serializable {

}