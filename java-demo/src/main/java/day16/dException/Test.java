package day16.dException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // Exception in thread "main" day16.dException.MyException
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        test();
    }

    private static void test() throws MyException {
        throw new MyException("这里是我自定义的异常的描述信息");
    }
}
