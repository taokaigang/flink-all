package day3.aExercise;

public class Six {
    // 设计一段程序，交换两个变量的值
    public static void main(String[] args) {
        int a = 10, b = 20;
        int tmp = a;
        a = b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);
    }
}
