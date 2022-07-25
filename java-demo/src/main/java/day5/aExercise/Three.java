package day5.aExercise;

import java.util.Scanner;
public class Three {
    // 从控制台输入一个数字，判断这个数字是不是一个质数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // 1. 质数的判断：如果一个数字只能被1和自己整除，那么这样的数字就是质数。
        // 2. 思路：假设所有的数字，都是质数。从2开始，到数字的前一位，判断是否存在将数字整除的情况。如果存在整除的情况，就说明不是质数

        // 认为所有的数字都是质数，用这个标记标记数字是否是质数
        boolean flag = number >= 2;
        // 从2开始，遍历到数字的前一位
        for (int i = 2; i <= number / 2; i++) {
            // 判断是否有数字可以吧number整除
            if (number % i == 0) {
                // 有数字可以整除，说明不是质数
                flag = false;
                break;
            }
        }
        // 根据标记，输出结果
        if (flag) {
            System.out.println(number + "是一个质数");
        }
        else {
            System.out.println(number + "不是一个质数");
        }
    }
}
