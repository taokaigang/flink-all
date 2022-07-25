package day4.dWhile;

/**
 * for循环和while循环的使用场景：
 *      1. 如果循环的次数是可预期的，使用 for 循环
 *      2. 如果循环的次数是不可预期的，但是有明确的结束条件，使用 while 循环
 */

public class While1 {
    // while循环的基本语法
    public static void main(String[] args) {
        // 案例：输出100次的 hello, world
        int times = 0;  // 定义一个变量，记录当前输出了多少次了
        while (times < 100) {
            System.out.println("hello, world");
            times++;
        }
    }
}
