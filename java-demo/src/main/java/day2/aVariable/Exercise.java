package day2.aVariable;

public class Exercise {
    public static void main(String[] args) {
        // 1. 将10给a赋值，完成后，a的值就是10
        int a = 10;
        // 2. 将a的值给b赋值，完成后，b的值就是10
        int b = a;
        // 3. 将b的值给c赋值，完成后，c的值就是10
        int c = b;
        System.out.println(c);

        // 小练习: 设计一段程序，交换x和y的值。
        int x = 10, y = 20;

        /* 1. 借助第三方变量交换
        int tmp = x;
        x = y;
        y = tmp;
         */
        // 2. 求和法
        x = x + y;          // x = 30, y = 20
        y = x - y;          // x = 30, y = 10
        x = x - y;          // x = 20, y = 10

        System.out.println(x);
        System.out.println(y);
    }
}
