package designer.decoration.example;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 被装饰的原始的对象
 */
public class Person implements Decorator {
    @Override
    public void show() {
        System.out.println("一个人站立在地上");
    }
}
