package day16.dException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description 自定义的异常类
 */
public class MyException extends RuntimeException {
    // 异常的描述信息
    // 在根类 Throwable 中，有一个私有的属性 detailMessage，存储异常的描述信息。
    // 在自定义异常描述信息的时候，只需要添加一个有参的构造方法即可完成

    public MyException() {}

    public MyException(String message) {
        // 调用父类中的构造方法，
        // 在父类中，再调用它的父类中的构造方法，一层层向上调用，最终可以调用到Throwable类中的有参构造
        // 实现对 detailMessage 属性的赋值。
        super(message);
    }
}
