package day8.coopExercise.exercise3;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个Person对象
        Person xiaoming = new Person();
        // 2. 属性赋值
        xiaoming.name = "xiaoming";
        xiaoming.age = 10;

        // xiaoming.pet = new Cat();

        Cat cat = new Cat();
        xiaoming.pet = cat;

        xiaoming.pet.name = "xiaobai";
        xiaoming.pet.age = 2;
        xiaoming.pet.furColor = "white";

        cat.name = "xiaohei";
        cat.age = 1;
        cat.furColor = "black";

        System.out.println(xiaoming.pet.name);
        System.out.println(xiaoming.pet.age);
        System.out.println(xiaoming.pet.furColor);
    }
}
