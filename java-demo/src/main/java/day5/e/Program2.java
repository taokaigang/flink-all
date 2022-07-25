package day5.e;

public class Program2 {
    public static void main(String[] args) {
        // 递归计算 1 + 2 + 3 + ... + n 的值

        System.out.println(sum(1000));
    }

    static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }
}
