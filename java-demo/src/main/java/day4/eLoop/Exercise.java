package day4.eLoop;

/**
 *
 * System.out.println():    输出小括号中的内容，并换行
 * System.out.print():      输出小括号中的内容，不换行
 *
 * 循环流程控制的练习
 *
 */
public class Exercise {
    public static void main(String[] args) {
        /*
                * * * * *
         */
        for (int column = 1; column <= 50; column++) {
            System.out.print("* ");
        }
        System.out.println();   // 换行

        /*
                * * * * *
                * * * * *
                * * * * *
                * * * * *
                * * * * *
         */
        // 将所有的一行的列打印，循环执行执行的次数，就可以得到指定的行数
        for (int line = 1; line <= 5; line++) {
            // 这里的是每一行的所有的列打印
            // 将以下这些代码执行一遍，可以得到指定列数的行
            for (int column = 1; column <= 5; column++) {
                System.out.print("* ");
            }
            System.out.println();   // 换行
        }

        /*
                *               1       1
                * *             2       1,2
                * * *           3       1,2,3
                * * * *         4       1,2,3,4
                * * * * *       5       1,2,3,4,5
         */
        // 外层循环，用来控制一共打印了多少行
        // 内层循环，用来控制每一行打印了多少列
        for (int line = 1; line <= 5; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
                在控制台输出九九乘法表
                1 x 1 = 1
                1 x 2 = 2       2 x 2 = 4
                1 x 3 = 3       2 x 3 = 6       3 x 3 = 9
         */
        for (int line = 1; line <= 9; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print(column + " x " + line + " = " + column * line + "\t");
            }
            System.out.println();
        }
    }
}
