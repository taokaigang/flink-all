package day5.e;

/**
 * 方法的递归，如果不注意，可能会出现栈溢出错误：StackOverflow
 */
public class Program {

    public static void main(String[] args) {

        System.out.println(calculate(5));
    }

    /**
     * 计算一个数字的阶乘
     * @param num 数字
     * @return 参数num的阶乘值
     */
    static int calculate(int num) {
        // 递归出口
        if (num == 1) {
            return 1;
        }
        // 不断递进、回归
        return num * calculate(num - 1);
    }

}
