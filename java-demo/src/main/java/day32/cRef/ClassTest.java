package day32.cRef;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/7
 * @Description Class类的测试
 */
public class ClassTest {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("day32.cRef.Person$InnerClass");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
