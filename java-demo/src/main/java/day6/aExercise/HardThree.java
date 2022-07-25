package day6.aExercise;

public class HardThree {
    // 求2+22+222+2222+22222+...+2...2的和，数字的数量由控制台输入
    public static void main(String[] args) {
        // 需要累加的数字数量
        int count = 5;

        // 1. 定义一个变量，用来存储累加的和
        int sum = 0;
        // 2. 定义一个变量，用来记录本次累加了什么数字
        int number = 2;
        // 3. 累加
        for (int i = 0; i < count; i++) {
            // 3.1. 累加数字
            sum += number;
            // 3.2. 计算下次需要累加的数字是谁
            number = number * 10 + 2;
        }

        System.out.println(sum);
    }
}
