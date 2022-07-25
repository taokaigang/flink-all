package self.day4.bAddition;

import java.util.Scanner;

/**
 * 1、【选做】【难】设计一个方法，计算一个正整数的二进制原码
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();

        String s = toBinaryString(a);
        System.out.println(s);


    }
    static String toBinaryString(int num){
        if (num<0)
            return "";
        String binary="";
        while (num!=0){
            int last=num%2;
            binary=last+binary;
            num/=2;
        }
        return binary;
    }
}
