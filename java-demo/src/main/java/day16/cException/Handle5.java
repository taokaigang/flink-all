package day16.cException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description throw关键字
 */
public class Handle5 {
    public static void main(String[] args) {
        int ret = calculate(10, 20);
        System.out.println(ret);
    }

    private static int calculate(int a, int b) {
        if (a > b) {
            return a - b;
        }
        // 否则，视为实参有逻辑错误，抛出一个异常
        RuntimeException exception = new RuntimeException();
        // 让当前的exception异常生效，使其可以终止程序的运行。
        // 而且，在一个方法中抛出了异常，从这个位置开始，向后所有的代码都不执行了。
        throw exception;
    }
}
