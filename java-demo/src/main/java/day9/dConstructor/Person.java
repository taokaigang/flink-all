package day9.dConstructor;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Person {
    String name;
    int age;
    char gender;
    int height;
    int weight;

    // 1. 知道怎么写构造方法（包括重载的构造）
    // 2. 知道怎么区分调用构造方法
    // 3. 知道怎么样在构造方法中调用其他的构造方法
    // 4. 知道什么情况下，类中会有默认的构造方法

    /*
    构造方法：
        如果一个类中没有写任何的构造方法，此时这个类中会包含一个默认的 public 权限的无参构造方法，为了可以实例化对象。
        如果一个类中写构造方法了，此时这个类将不再提供这个默认的无参构造。
     */

    /**
     * 构造方法: 执行时机：在实例化对象的时候执行。
     * 一般情况下，在构造方法中，是为了在实例化对象的同时，给一些属性进行初始化的赋值操作
     * 由于这个构造方法没有参数，那么这个构造方法被称为 -- 无参构造
     */
    // Person() {
    //     System.out.println("Person类的无参构造方法执行了");
    // }

    Person(String name, int age, char gender) {
        System.out.println("Person类的三个参数的构造方法执行了");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 在一个构造方法中，调用其他的构造方法
     * this(): 用在构造方法中，表示调用当前类的其他的构造方法
     * 在使用this()调用其他构造方法的时候，注意事项：
     * 1. this()调用语句，必须在这个构造方法的第一句。
     * 2. 不能出现构造方法的循环调用。
     */
    Person(String name, int age, char gender, int height, int weight) {
        // 调用当前类中，三个参数的构造方法
        this(name, age, gender);
        System.out.println("Person类的五个参数的构造方法执行了");
        this.height = height;
        this.weight = weight;
    }
}
