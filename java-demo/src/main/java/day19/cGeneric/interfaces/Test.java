package day19.cGeneric.interfaces;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description 泛型接口的使用
 */
public class Test {
    public static void main(String[] args) {
        // 使用匿名内部类的形式实现接口
        MyInterface1<Person> impl = new MyInterface1<Person>() {
            @Override
            public int compareTo(Person o1, Person o2) {
                return 0;
            }
        };

        // 使用lambda表达式实现接口
        // 此时，会根据左侧的接口引用中的泛型，推导出接口实际指派的类型是谁
        MyInterface1<Person> impl1 = (o1, o2) -> o1.age - o2.age;
        MyInterface1<String> impl2 = (o1, o2) -> o1.length() - o2.length();
    }
}

// 定义一个泛型接口
interface MyInterface1<T> {
    int compareTo(T o1, T o2);
}

// 子接口
interface SubMyInterface extends MyInterface1<String> {}

// 实现类
class MyInterface1Impl implements MyInterface1<Person> {
    @Override
    public int compareTo(Person o1, Person o2) {
        return 0;
    }
}

class Person {
    int age;
}