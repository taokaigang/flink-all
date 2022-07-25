package self.day18aExercise;

import java.util.Arrays;

public class One {
    /**
     * 1. 已知字符串："this is a test of java". 按要求执行以下操作：
     *      (1) 【简】统计该字符串中字母s出现的次数
     *      (2) 【简】取出子字符串"test"
     *      (3) 【简】将本字符串复制到一个字符数组Char[] str中.
     *      (4) 【中】将字符串中每个单词的第一个字母变成大写， 输出到控制台。
     * @param args
     */
    public static void main(String[] args) {
        String string=new String("this is a test of java");
        int count = getCount(string);
        System.out.println(count);

        String substring = string.substring(10, 14);
        System.out.println(substring);

        char[] str = string.toCharArray();
        System.out.println(Arrays.toString(str));

        String[] split = string.split(" +");
        for (int i = 0; i < split.length; i++) {
            String str2=split[i].substring(0,1).toUpperCase()+split[i].substring(1);
            System.out.println(str2+" ");
        }

    }

    private static int getCount(String string) {
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            char ch=string.charAt(i);
            if (ch=='s'){
                count++;
            }
        }
        return count;
    }
}
