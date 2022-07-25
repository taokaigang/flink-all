package day4.bFor;

/**
 * 循环三要素：
 *      循环的起点：
 *      循环的条件：
 *      循环的步长：
 *
 * 循环的使用场景：
 *      1. 某一段代码需要被重复执行
 *      2. 每次执行的之间是相同的，或者是遵循一定的规律的
 */
public class For1 {
    public static void main(String[] args) {
        // 一般情况下，在循环中，都需要定义一个变量，用来标记当前循环的次数、状态，配合循环条件使用
        for (int times = 0; times < 100; times++) {
            System.out.println("hello, world");
        }
    }
}
