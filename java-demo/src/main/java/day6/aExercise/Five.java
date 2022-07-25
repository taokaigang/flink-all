package day6.aExercise;

public class Five {
    // 使⽤递归计算 1+2+3+...+100 的和
    public static void main(String[] args) {
        System.out.println(sum(50));
    }
    // 1 + 2 + 3 + ... + num
    static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }

    // num + .... + 100
    /*
    static int sum(int num) {
        if (num == 100) {
            return 100;
        }
        return num + sum(num + 1);
    }
     */




}
