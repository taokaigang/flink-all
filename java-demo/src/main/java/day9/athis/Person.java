package day9.athis;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 *      属性的名字，和局部变量的名字，是可以重复的。
 *
 *      this关键字：
 *          在方法中，进行成员访问的时候，无论访问的是属性还是方法，理论上来讲，this关键字都是需要添加上的。
 *          但是，通常情况下，this都是可以省略不写的。
 *      this不能省略的情况：
 *          当出现了属性的名字和局部变量的名字重复的情况，为了区分调用不同属性和局部变量，此时的this是不能省略的。
 */
public class Person {
    String name;
    int age;
    char gender;
    int height;
    int weight;

    void setInfo(String name, int age, char gender, int height, int weight) {
        // 如果出现了属性名字和局部变量名字重复
        // 在方法中，如果直接写属性的名字，默认使用的是局部变量
        // 这里遵循“最近原则”
        // 此时，如果需要访问属性，必须添加关键字 this
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }


}
