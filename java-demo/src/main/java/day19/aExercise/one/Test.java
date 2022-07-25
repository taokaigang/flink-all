package day19.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 *
 *      已知字符串："this is a test of java". 按要求执行以下操作：
 *      (1) 【简】统计该字符串中字母s出现的次数
 *      (2) 【简】取出子字符串"test"
 *      (3) 【简】将本字符串复制到一个字符数组Char[] str中.
 *      (4) 【中】将字符串中每个单词的第一个字母变成大写， 输出到控制台
 */
public class Test {
    public static void main(String[] args) {
        String str = "this is a test of java";

        // 1. 统计该字符串中字母s出现的次数
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                count++;
            }
        }
        System.out.println("第一题: " + count);

        // 2. 取出子字符串"test"
        String sub = str.substring(10, 14);
        System.out.println(sub);

        // 3. 将本字符串复制到一个字符数组char[] str中.
        char[] arr = str.toCharArray();

        // 4. 将字符串中每个单词的第一个字母变成大写，输出到控制台
        // 4.1. 获取到每一个单词
        String[] words = str.split(" +");
        // 4.2. 遍历每一个单词
        for (int i = 0; i < words.length; i++) {
            // 4.3. 得到每一个元素
            String word = words[i];
            // 4.4. 获取单词的首字母
            char c = word.charAt(0);
            // 4.5. 修改首字母大写
            StringBuilder sb = new StringBuilder(word);
            sb.setCharAt(0, Character.toUpperCase(c));
            // 4.6. 将修改之后的数据，放回到数组中
            words[i] = sb.toString();
        }

        // 4.7. 将首字母转成大写之后的每一个单词拼接到一起。
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
