package day7.bArray;

import java.util.Scanner;

/**
 * 程序调试，实时的观测程序的运行
 *      1. 希望调试的位置，前面点一下，加上断点
 *      2. 调试程序，使用 Debug，不要使用 Run
 *      3. Debug之后，程序会运行，一直到断点位置，暂停
 *      4. 如果程序停到了某一行代码上，表示该执行这一行代码了，但是还没执行。
 *
 * 调试的按钮：
 *      Step Over: 单步跳过，F8。可以让程序逐行执行。如果遇到方法，不会进入方法内部，而是直接将方法中的所有逻辑全部都执行完了。
 *      Step Into: 单步进入，F7。可以让程序逐行执行。如果遇到方法，会进入方法内部，逐行执行。
 *      Force Step Into: 强制单步进入，Alt + Shift + F7。可以让程序逐行执行，如果遇到方法，进入到方法内部，逐行执行。
 *                       和Step Into的区别：
 *                              Step Into，只会进入自定义的方法，不会进入系统方法。
 *                              Force Step Into，会进入系统方法内部。
 *      Drop Frame: 当进入到一个代码段中的时候才会显式。返回到这个代码段进入之前。
 *      Step Out: 单步跳出。如果在一个方法中，直接结束方法，
 *      Run to Cursor: 从当前位置，到下一个断点
 */
public class Debug {
    public static void main(String[] args) {
        debuggerTest2();
    }

    static void debuggerTest2() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void debuggerTest1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个数字");
        int num1 = scanner.nextInt();
        System.out.println("请再输入一个数字");
        int num2 = scanner.nextInt();

        int result = calculate(num1, num2);
        System.out.println(result);
    }

    static int calculate(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        }
        else {
            return num2 - num1;
        }
    }
}
