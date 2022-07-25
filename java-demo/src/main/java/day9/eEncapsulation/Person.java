package day9.eEncapsulation;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }
}
