package day16.bEnum;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class EnumTest {
    public static void main(String[] args) {
        // 1. 获取一个枚举对象
        Gender gender = Gender.Male;
        // 1.1. 证明方式1: 枚举对象，可以调用Object类中的方法，说明这些方法是从Object类中继承到的。
        String str = gender.toString();
        // 1.2. 证明方式2: 可以向上转型为 Object 类型。
        Object obj = gender;
    }
}
