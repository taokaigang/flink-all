package self.day3.zHomeWork;

import java.util.Scanner;

/**
 * 水仙花数（Narcissistic number）也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、
 * 自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），
 * 水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
 *
 * */
public class NarcissisticNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner scanner = new Scanner(System.in);
        int narc=scanner.nextInt();
        int a=narc/100%10;
        int b=narc/10%10;
        int c=narc%10;
        int narc_sum= (int) (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
        if(narc<=99 || narc>=1000){
            System.out.println(narc+"不是水仙花数,请输入一个三位数");
        }else if(narc_sum==narc){
            System.out.println(narc+"是水仙花数");
        }else {
            System.out.println(narc+"不是水仙花数");
        }
    }
}
