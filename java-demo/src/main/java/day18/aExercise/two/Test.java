package day18.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description
 *      【简】已知方法 trim(String str, char c) 的作用是，去除字符串首尾指定的字符，实现这个方法。
 *      思路: 找到字符串中，字符c首次和最后一次出现的下标，截取中间部分即可
 */
public class Test {

    public static void main(String[] args) {
        String result = trim("aaaaaaaahello a worldaaaaaa", 'a');
        System.out.println(result);
    }

    private static String trim(String str, char c) {
        // 1. 计算从前往后第一个非c字符出现的下标
        int start = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                start = i;
                break;
            }
        }

        // 2. 计算从后往前第一个非c字符出现的下标
        int end = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != c) {
                end = i;
                break;
            }
        }

        // 3. 特殊情况处理
        if (start == -1) {
            return str;
        }
        return str.substring(start, end + 1);
    }
}
