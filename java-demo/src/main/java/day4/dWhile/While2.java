package day4.dWhile;

public class While2 {
    // do-while 循环
    // 先执行循环体，再判断循环条件是否成立。
    // 和while的区别：如果一开始的循环条件就是不成立的，那么 do-while 会比 while 循环多执行一次循环体
    public static void main(String[] args) {
        // 案例：输出100次的 hello, world
        int times = 0;
        do {
            System.out.println("hello, world");
            times++;
        }
        while (times < 100);
    }
}
