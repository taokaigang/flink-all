package day5.cReturn;

/**
 * 返回值类型的定义，与方法的返回值
 *
 *      可以使用返回值，实现方法中的某一个数据，回传给调用方。
 */
public class Return1 {

    public static void main(String[] args) {
        // 校验
        // 输出所有的水仙花数
        for (int num = 100; num < 1000; num++) {
            if (check(num)) {
                System.out.println(num);
            }
        }
    }

    // 需求: 设计一个方法，判断一个数字是否是水仙花数
    /*
        返回值类型：声明这个方法执行结束之后，可以得到什么样类型的结果
                  如果一个方法的返回值类型不是void，那么这个方法在执行结束之前，必须要有一个返回值。
     */
    static boolean check(int number) {
        boolean flag = true;
        if (number >= 1000 || number < 100) {
            flag = false;
        }
        else {
            int g = number % 10;
            int s = number / 10 % 10;
            int b = number / 100;
            flag = g*g*g + s*s*s + b*b*b == number;
        }

        return flag;
    }
}
