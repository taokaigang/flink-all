package day18.aExercise.four;

import java.util.Random;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description
 *      【难】给定一个长度，生成一个指定长度的字符串，这个字符串由随机的字母、数字或下划线组成。(不用必须同时包含字母、数字、下划线)
 *
 *
 */
public class Program {
    public static void main(String[] args) {
        // 思路: 可以将所有字符串中可能取到的字符，预存起来
        //      随机一个下标，从这个预存的数据源中获取字符，拼接到结果中
        System.out.println(getRandomString(7));
    }

    private static String getRandomString(int count) {
        // 1. 准备数据源
        String dataSource = getDataSource();
        // 2. 实例化一个随机数对象
        Random random = new Random();
        // 3. 实例化一个字符串，作为最终的结果
        String str = "";
        // 4. 循环拼接
        for (int i = 0; i < count; i++) {
            str += dataSource.charAt(random.nextInt(dataSource.length()));
        }

        return str;
    }

    private static String getDataSource() {
        return "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";
    }
}
