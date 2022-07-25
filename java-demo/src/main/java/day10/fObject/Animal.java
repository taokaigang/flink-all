package day10.fObject;


/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 *      Class<?> getClass()
 *          获取用来描述这个类的Class对象，暂时不用考虑，在反射部分讲解。
 *      int hashCode()
 *          获取当前对象属性值在哈希表中的位置索引，暂时不用考虑，在集合部分讲解。
 *      boolean equals(Object o)
 *          提供了用来比较两个对象是否“相等”的判断依据。
 *      String toString()
 *
 */
public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 如果在比较两个对象的时候，需要用自己的逻辑进行比较，此时就可以自定义equals方法
    /*
        比较的时候，需要遵循如下规范
        1. 如果两个对象的地址相同，一定要返回true
        2. 如果o是null，一定要返回false
        3. 如果两个要比较的对象类型不同，一定要返回false
        4. 如果 a.equals(b) 成立，则 b.equals(a) 也必须成立
        5. 如果 a.equals(b) 成立，b.equals(c) 成立，则 a.equals(c) 也必须成立
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // 逻辑：基本上属性值的比较
        // 这里的逻辑是：如果每一个属性值都是相同的，则认为时候相同的对象
        // 以后注意：字符串的比较，也用equals进行比较
        Animal person = (Animal) o;
        return person.name.equals(name) && person.age == age;
    }

    /*
        返回一个对象的字符串表示形式，当需要将对象转成字符串的时候，此时会自动的调用这个方法
     */
    public String toString() {
        return "name = " + name + ", age = " + age;
    }
}


class Test {
    public static void main(String[] args) {
        // 1. 实例化一个Animal对象
        Animal animal1 = new Animal("xiaohong", 1);
        Animal animal2 = new Animal("xiaohong", 1);


        System.out.println(animal1);

        // System.out.println(animal1 == animal2);
    }
}