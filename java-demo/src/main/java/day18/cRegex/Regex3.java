package day18.cRegex;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description
 */
public class Regex3 {
    public static void main(String[] args) {
        // split();
        // replace();
        example();
    }

    // QQ号的规则：
    //      1. 纯数字组成的
    //      2. 不能以0作为开头
    //      3. 长度在 [6,11]
    private static boolean chechQQ(String qqNumber) {
        return qqNumber.matches("[1-9]\\d{5,10}");
    }

    // xxx@126.com
    // 验证邮箱的合法性
    //      1. 126
    //      2. 前半部分可以是任意的单词字符, 长度限制在 [4,12]
    //      3. 以.com作为结尾
    private static boolean checkEmail(String email) {
        return email.matches("\\w{4,12}@126\\.com");
    }

    private static void split() {
        // 需求: 将一个存储有所有的姓名的字符串，切割出每一个名字。
        String names = "lily        lucy           polly      Jim       LiLei      HanMeimei";
        // 实现: 借助字符串的一个方法 split(String regex)
        //      将字符串中，满足正则规则的子部分，切割掉
        String[] nameArr = names.split(" +");
        System.out.println(Arrays.toString(nameArr));
    }

    private static void replace() {
        // 需求: 将这个存储有所有的名字的字符串，名字之间的分隔用, 来替代
        String names = "lily        lucy           polly      Jim       LiLei      HanMeimei";
        // 实现: 借助字符串中的一个方法 replaceAll(String regex, String replacement)
        //      将字符串中，满足指定正则的部分，替换成 replacement
        // String result = names.replaceAll(" +", ", ");
        String result = names.replaceFirst(" +", ", ");
        System.out.println(result);
    }

    private static void example() {
        // 需求: 将一个手机号的中间4位替换成 ****
        //      17788889999 => 177****9999
        String phoneNumber = "17788889999";
        // 在replace方法中，使用$1获取第一个分组的值
        String result = phoneNumber.replaceAll("(1\\d{2})(\\d{4})(\\d{4})", "$1****$3");
        System.out.println(result);
    }
}
