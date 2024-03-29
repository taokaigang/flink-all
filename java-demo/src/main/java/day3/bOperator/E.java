package day3.bOperator;

/**
 * 位运算符：
 *      将两个【整型数字】，求出【补码】（参与运算的都是补码）。将补码中的每一位进行类似于逻辑运算的操作。1相当于true，0相当于false。
 *      &    |    ^    ~
 *      <<   >>   >>>
 *
 *      ^ : 位异或，如果一个数字和另外一个数字异或两次，一定得到自己
 */
public class E {
    public static void main(String[] args) {
        // 1. 定义两个整型变量
        int x = 10, y = -9;
        /*
        10: 0000 1010
        -9: 1111 0111补码
         */
        // 2. 位运算
        System.out.println(x & y);      // 0000 0010 => 2
        System.out.println(x | y);      // 1111 1111 => -1
        System.out.println(x ^ y);      // 1111 1101 -> -3
        System.out.println(~y);         // 0000 1000 -> 8

        // 3. 移位运算符（位移运算符）
        //    << : 将补码中的每一位，依次向左移动指定的位数
        //         在最后位补0，左侧溢出的位直接移除。
        //         每向左移动一位，都在最后补了一个零，每向左移动一位，相当于这个数字【乘2】
        //    >>: 将补码中的每一位，依次向右移动指定的位数
        //        在最左侧补【符号位】
        //        每向右移动一位，相当于这个数字【除以2】，但是这里遵循的向下取整（y轴坐标，取向下的）
        //    >>>: 将补码中的每一位，依次向右移动指定的位数
        //         【无符号】位右移，最高位补0
        System.out.println(10 << 2);    // 0010 1000 -> 40
        System.out.println(10 >> 2);    // 0000 0010 -> 2
        System.out.println(-9 >> 2);    // 1111 1101 -> 1000 0011 -> -3
        System.out.println(-9 >>> 2);   //                              1073741821
    }
}
