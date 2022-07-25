package day4.eLoop;

public class Exercise2 {
    public static void main(String[] args) {
        /*
                     *              1   5       1   4
                   * * *            2   6       2   3
                 * * * * *          3   7       3   2
               * * * * * * *        4   8       4   1
             * * * * * * * * *      5   9       5   0
         */
        // 1. 输出补充多余空格部分
        // 2. 剔除空格
        for (int line = 1; line <= 5; line++) {
            for (int column = 1; column - line <= 4; column++) {
                if (line + column <= 5) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
