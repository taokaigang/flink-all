package day12.aExrcise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public abstract class TrafficTools {
    public abstract void drive();
}

class Car extends TrafficTools {
    @Override
    public void drive() {
        System.out.println("汽车在公路上驾驶");
    }
}

class Train extends TrafficTools {
    @Override
    public void drive() {
        System.out.println("火车在铁路上驾驶");
    }
}

class Plane extends TrafficTools {
    @Override
    public void drive() {
        System.out.println("飞机在天上驾驶");
    }
}
