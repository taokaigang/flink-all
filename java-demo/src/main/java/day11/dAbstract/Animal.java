package day11.dAbstract;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 *      抽象类的特点：
 *          1. 抽象类不能实例化对象。抽象类是一个不够完整、不够具体的类，在这个类中仅仅提供了所有的子类的共性。
 *          2. 抽象类不能实例化对象，但是类中是可以写属性、方法、构造方法。此时，这些内容是为了继承给子类的。
 *          3. 抽象类中可以包含抽象方法。
 *
 *      抽象方法的特点：
 *          1. 使用关键字abstract修饰，表示这个方法只有方法的声明部分，没有实现部分。是一个抽象方法。
 *          2. 抽象方法只能包含在一个抽象类中。
 *          3. 非抽象子类，在继承自一个抽象父类的同时，必须重写实现父类中的所有的抽象方法。
 */
public abstract class Animal {
    protected String name;
    protected int age;
    protected char gender;

    public Animal() {}
    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 抽象方法：只提供方法的声明，没有方法的实现。
    //
    public abstract void bark();
    public void eat() {}
    public void sleep() {}
    public void walk() {}
}

class Cat extends Animal {
    @Override
    public void bark() {
        System.out.println("恶龙咆哮~Ao~~~");
    }
}

class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("Won~~");
    }
}

class Sheep extends Animal {
    @Override
    public void bark() {
        System.out.println("mie~~");
    }
}

class Fish extends Animal {
    @Override
    public void bark() {
        System.out.println("Blue~Blue~Blue~");
    }
}
