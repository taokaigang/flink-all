package day19.dGeneric;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //
        GenericTestClass<Dog> obj = new GenericTestClass<>();
        // 向上转型
        // GenericTestClass<Animal> obj1 = obj;
        test(obj);
    }

    /**
     * ? : 代表通配符，表示实际指向的对象，泛型可以是任意类型。
     * ? extends Dog : 表示实际指向的对象，泛型可以是Dog类，也可以是Dog的子类
     * ? super Dog : 表示实际指向的对象，泛型可以是Dog类，也可以是Dog的父类
     */
    public static void test(GenericTestClass<? super Dog> obj) {}
}

class GenericTestClass<T> {}

class Animal {}
class Dog extends Animal {}
class Hashiqi extends Dog {}
