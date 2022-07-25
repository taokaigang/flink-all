package day32.cRef;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description
 */
public class Person {
    public String name;
    private int age;
    public static int a;
    private static int b;

    public Person() {
        System.out.println("Person类的无参构造方法执行了");
    }

    private Person(String name) {
        System.out.println("Person(String) 构造方法被调用");
        this.name = name;
    }

    public Person(String name, int age) throws ArrayIndexOutOfBoundsException, NullPointerException {
        System.out.println("Person(String, int) 构造方法被调用");
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Show()");
    }

    private void show(int a, int b) {
        System.out.println("show(a = " + a + ", b = " + b + ")");
    }

    private static int show(int a, int b, int c) {
        System.out.println("Show(a = " + a + ", b = " + b + ", c = " + c + ")");
        return a + b + c;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class InnerClass {
        static {
            System.out.println("这里是InnerClass的静态代码段");
        }
    }
}
