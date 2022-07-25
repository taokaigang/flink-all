package day23.aExercise.three;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description
 */
public class Program {
    // 从控制台输⼊⼀串字符串，统计这个字符串中每⼀个字符出现的次数，并整理成新的字符串输出。
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calculate(input);
        System.out.println(result);
    }

    /**
     * 统计一个参数字符串中每一个字符出现的次数
     * @param input 需要统计的字符串
     * @return 拼接好的结果
     */
    private static String calculate(String input) {
        // 1. 统计每一个字符出现的次数，实例化一个Map集合
        //    键就是字符，值就是这个字符出现的次数
        Map<Character, Integer> map = new LinkedHashMap<>();
        // 2. 遍历字符串中每一个字符，统计出现的次数
        char[] array = input.toCharArray();
        for (char c : array) {
            // 3. 获取c这个字符出现的次数
            int count = map.getOrDefault(c, 0);
            // 4. 将这个数量+1，存入集合中
            map.put(c, count+1);
        }
        // 5. 实例化一个StringBuilder，用来拼接最后的结果
        StringBuilder stringBuilder = new StringBuilder();
        // 6. 遍历集合，拼接数据
        map.forEach((k, v) -> stringBuilder.append(k).append("(").append(v).append(")"));
        // 7. 返回结果
        return stringBuilder.toString();
    }
}
