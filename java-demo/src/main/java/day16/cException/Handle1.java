package day16.cException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description
 *      异常的基本的捕获处理
 */
public class Handle1 {
    public static void main(String[] args) {

        try {
            // 会出现 ArrayIndexOutOfBoundsException 异常的代码
            int[] array = new int[5];
            array[5] = 10;

            System.out.println("11");
        }
        // catch的异常类型，一定要和try中实际出现的异常类型一致
        catch (Exception e) {
            e.printStackTrace();        // 打印异常的信息
            System.out.println("出现了一个数组下标越界异常");
        }

        System.out.println("end");
    }
}
