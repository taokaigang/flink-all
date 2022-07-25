package day8.boop;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description 对象的实例化
 */
public class Program {
    public static void main(String[] args) {
        // 实例化对象：
        Avengers ironMan = new Avengers();
        Avengers captionAmerican = new Avengers();
        Avengers thor = new Avengers();
        Avengers hulk = new Avengers();

        // 属性访问
        ironMan.name = "钢铁侠";
        ironMan.age = 35;
        ironMan.gender = '男';

        captionAmerican.name = "美国队长";
        captionAmerican.age = 98;
        captionAmerican.gender = '男';

        System.out.println(ironMan.age);
        System.out.println(captionAmerican.age);

        // 方法访问
        ironMan.eat();
        captionAmerican.sleep();


        // 静态属性的访问
        // 静态的属性，可以被所有的对象共享的。理论上来讲，是可以用对象访问的。
        // 实际操作中，都是使用类进行访问的。
        // ironMan.count = 10;
        // captionAmerican.count = 20;
        // System.out.println(ironMan.count);
        // System.out.println(captionAmerican.count);
        Avengers.count = 10;
        System.out.println(Avengers.count);

        Avengers.assemble();
    }
}