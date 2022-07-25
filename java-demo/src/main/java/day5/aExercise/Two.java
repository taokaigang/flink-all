package day5.aExercise;

public class Two {
    // 输出所有的水仙花数
    public static void main(String[] args) {
        for (int number = 100; number < 1000; number++) {
            // 依次判断每一个数字是否是水仙花数
            int b = number / 100;
            int s = number / 10 % 10;
            int g = number % 10;

            if (g*g*g+s*s*s+b*b*b == number) {
                System.out.println(number);
            }
        }
    }
}
