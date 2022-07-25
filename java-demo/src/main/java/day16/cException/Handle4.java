package day16.cException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description finally的使用
 */
public class Handle4 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("出现了算术异常");
        }
        finally {
            System.out.println("finally代码段中的内容执行了");
        }

        System.out.println("end");
    }
}
