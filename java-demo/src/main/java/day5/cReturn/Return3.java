package day5.cReturn;

public class Return3 {
    // 案例：输出100以内所有的质数
    public static void main(String[] args) {
        // 思路：遍历100以内所有的数字，判断这个数字是否是一个质数
        //      如果是一个质数，输出。如果不是一个质数，校验下一个数字。
        for (int num = 1; num <= 100; num++) {
            // 判断这个数字即可
            if (check(num)) {
                System.out.println(num);
            }
        }
    }

    /**
     * 验证一个数字是不是质数
     * @param num 需要验证的数字
     * @return 验证的结果
     */
    static boolean check(int num) {
        if (num < 2) {
            return false;
        }
        // 能执行到这一步，说明上方的 num < 2 是不成立的
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                // 说明有一个数字把num整除了
                return false;
            }
        }
        // 如果上面的循环，每一个数字都不能够整除num，说明是一个质数
        return true;
    }
}
