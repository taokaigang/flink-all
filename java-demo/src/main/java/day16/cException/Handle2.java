package day16.cException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 */
public class Handle2 {
    public static void main(String[] args) {

        try {
            int b = (int)(Math.random() * 3);   // [0, 3) => { 0, 1, 2 }
            int a = 10 / b;                     // ArithmeticException

            int[] array = new int[5];
            array[5] = 10;                      // ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e) {
            System.out.println("出现了算术异常");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("出现了数组下标越界异常");
        }
        catch (RuntimeException e) {
            System.out.println("出现了运行时异常");
        }


        System.out.println("end");
    }
}
