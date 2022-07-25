package self.day17.aExercise;

import java.util.Arrays;
import java.util.Scanner;

public class One {
    /**
     * 1. 【难】从控制台输入一个字符串，记录出现次数最多的字符，并输出这个字符出现了多少次。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        char max='a';// （先假设）记录出现次数最多元素
        int maxCount=0;// 记录最大出现次数
        int count=1;// 中间传值参数 判断当前元素出现次数
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i]==chars[i+1]){
                count++;
            }
            if (chars[i] != chars[i+1]){
                if (count>maxCount){
                    maxCount=count;
                    max=chars[i];
                }
                count=1;
            }
        }
        System.out.println("出现次数最多的字符是："+max+"，这个字符出现了"+maxCount+"次。");
    }
}
