package day12.aExrcise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Program {
    public static void main(String[] args) {
        // 1. 实例化一个汽车对象
        Car car = new Car();
        car.drive();

        // 2. 实例化一个火车对象
        Train train = new Train();
        train.drive();

        // 3. 实例化一个飞机
        Plane plane = new Plane();
        plane.drive();
    }
}
