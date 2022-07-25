package day13.dlambdaSyntax2;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Syntax3 {
    private static class Person {
        String name;
        int age;
        public Person() {
            System.out.println("一个Person对象被实例化了");
        }
        public Person(String name, int age) {
            System.out.println("一个Person对象被有参的实例化了");
            this.name = name;
            this.age = age;
        }
    }

    @FunctionalInterface
    private interface GetPerson {
        // 仅仅是希望获取到一个Person对象作为返回值
        Person test();
    }

    private interface GetPersonWithParameter {
        Person test(String name, int age);
    }

    public static void main(String[] args) {
        // lambda表达式实现接口
        GetPerson lambda = Person::new;     // 引用到Person类中的无参构造方法，获取到一个Person对象
        Person person = lambda.test();

        GetPersonWithParameter lambda2 = Person::new;   // 引用到Person类中的有参构造方法，获取到一个Person对象
        lambda2.test("xiaoming", 1);
    }
}
