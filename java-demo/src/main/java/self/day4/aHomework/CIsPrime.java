package self.day4.aHomework;

import java.util.Scanner;

/**
 * 3、从控制台输入一个数字，判断这个数字是不是一个质数
* */
public class CIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)){
            System.out.println(number+"是素数");
        }else {
            System.out.println(number+"不是素数");
        }
    }

    /**
     *
     * @param number
     * @return
     */
    static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if (number % i == 0 && i < number)
                return false;
        }
        return true;
    }
}
