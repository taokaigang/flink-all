package self.day22.aExercise.three;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Three {
    /**
     * 3. 【难】从控制台输⼊⼀串字符串，统计这个字符串中每⼀个字符出现的次数，并整理成新的字符串输出。
     *      输⼊： abccaabdsswaabbsc
     *      输出： a(5)b(4)c(3)d(1)s(3)w(1)
     * @param args
     */
    public static void main(String[] args) {
        Map<Character,Integer> map=new TreeMap();
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch,!map.containsKey(ch) ? 1:(map.get(ch) + 1 ));
        }
       map.forEach((k,v)->
                       System.out.print(k+"("+v+")")
               );
    }
}
