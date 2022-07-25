package day19.cGeneric.methods;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 */
public class MethodTest {
    public static void main(String[] args) {
        test("hello");
        test(1);
        test(3.14);
        test(new MethodTest());
    }
    // 定义一个泛型方法
    public static <T> void test(T t) {
        System.out.println(t.getClass());
    }
}
