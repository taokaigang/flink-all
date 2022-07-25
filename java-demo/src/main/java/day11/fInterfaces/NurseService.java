package day11.fInterfaces;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
interface NurseService {
    void wash();
    void clean();
    void cook();
}

interface CookerService {
    void cook();
}

/**
 * 接口之间也是有继承关系存在的，并且接口之间的继承是多继承。
 */
interface GirlFriendService extends NurseService, CookerService {
    // 此时，这个接口中包含了所有的父接口中的所有方法
    // 同时，还可以添加自己独有的方法
}


abstract class Person {
    public abstract void cook();
}
/**
 * 一个类是可以同时实现多个接口的，如果同时实现多个接口，则必须重写实现每一个接口中的所有的抽象方法。
 * 如果一个类实现的多个接口中，有相同的方法。实现类只需要实现一次即可。
 */
class GirlFriend extends Person implements GirlFriendService {
    @Override
    public void wash() {

    }

    @Override
    public void clean() {

    }

    @Override
    public void cook() {

    }
}