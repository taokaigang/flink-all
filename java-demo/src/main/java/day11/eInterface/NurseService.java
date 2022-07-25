package day11.eInterface;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description 保姆行业的从业规范
 */
public interface NurseService {
    // 接口中可以定义属性，属性的默认的修饰符是 public static final
    String DESCRIPTION = "desc";
    // 接口中可以定义方法，方法的默认的修饰符是 public abstract
    void wash();
    void clean();
    void cook();
    String toString();
}

// 类实现接口：使用关键字 implements
//           非抽象类在实现接口后，必须重写实现接口中所有的抽象方法。
//           抽象类在实现接口后，对于接口中的方法，可以重写实现，也可以不重写。
class Person {
    public void wash() {

    }
}
class Nurse extends Person implements NurseService {
    @Override
    public void clean() {

    }

    @Override
    public void cook() {

    }
}

