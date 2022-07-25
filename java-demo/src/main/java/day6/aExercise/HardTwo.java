package day6.aExercise;

public class HardTwo {
    public static void main(String[] args) {
        // 12345 => 54321
        int num = 12321;
        System.out.println(num == getReverse(num));
    }

    /**
     * 计算一个数字翻转之后的数字
     * @param number 数字
     * @return 翻转之后的数字
     */
    static int getReverse(int number) {
        /*
        12345    54321
        1234     5
        123      54
        12       543
        1        5432
        0        54321
         */
        // 1. 定义一个变量，用来记录翻转之后的数字
        int reverse = 0;
        // 2. 依次获取数字的最后位
        while (number != 0) {
            // 2.1. 计算个位数字
            int last = number % 10;
            // 2.2. 将个位数字拼接到反转之后的数字后面
            reverse = reverse * 10 + last;
            // 2.3. 修改源数字
            number /= 10;
        }
        // 3.
        return reverse;
    }
}
