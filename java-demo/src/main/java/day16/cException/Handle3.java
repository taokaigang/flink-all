package day16.cException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Handle3 {
    public static void main(String[] args) {
        // 需求:
        // NullPointerException  ArrayIndexOutOfBoundsException  这两种异常处理方式相同， 输出 “数组相关异常”
        // ArithmeticException  NumberFormatException  这两种异常处理方式相同, 输出 “格式异常”

        try {
            nullPointerTest();      // NullPointerException
            outOfBoundsTest();      // ArrayIndexOutOfBoundsException
            arithmeticTest();       // ArithmeticException
            formatException();      // NumberFormatException
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("数组相关异常");
        }
        catch (ArithmeticException | NumberFormatException e) {
            System.out.println("格式异常");
        }
    }

    // NullPointerException
    private static void nullPointerTest() {
        int[] array = null;
        array[0] = 10;
    }

    // ArrayIndexOutOfBoundsException
    private static void outOfBoundsTest() {
        int[] array = new int[5];
        array[5] = 10;
    }

    // ArithmeticException
    private static void arithmeticTest() {
        int a = 10 / 0;
    }

    // NumberFormatException
    private static void formatException() {
        Integer i = Integer.valueOf("123a");
    }
}
