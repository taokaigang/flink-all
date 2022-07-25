package day10.cOverride;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("Won~");
    }
}

class Cat extends Animal {
    @Override
    public void bark() {
        System.out.println("Meow~");
    }
}

class Sheep extends Animal {
    @Override
    public void bark() {
        System.out.println("咩~~");
    }
}

class Rabbit extends Animal {

}

class Chicken extends Animal {
    @Override
    protected void bark() {
        System.out.println("大爷，来玩啊~~");
    }
}