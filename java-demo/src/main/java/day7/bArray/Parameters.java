package day7.bArray;

/**
 * 使用数组，实现可变长度的参数
 */
public class Parameters {
    public static void main(String[] args) {
        // calculate(new int[]{ 10, 20, 30, 40, 50, 60 });
        calculate(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
    }

    /**
     * 不定长度的参数
     *      数据类型... : 用在形参列表中，表示数组类型
     *      这种数据类型的形参，在调用的时候，可以直接将数组中的元素，写到参数列表中
     *      将数组中的元素，直接写到实参列表中，系统会自动的将这些元素存入一个数组，再将数组的地址传递给这个形参
     * 注意事项
     *      这样的不定参数的参数，在参数列表中，必须放在最后位。
     * @param parameters 参数列表
     */
    static void calculate(int a, int... parameters) {
        for (int parameter : parameters) {
            System.out.print(parameter + ", ");
        }
    }
}
