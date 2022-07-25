package day18.cRegex;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description
 */
public class Regex1 {

    public static void main(String[] args) {
        System.out.println(checkWithRegex("123456"));            // true
        System.out.println(checkWithRegex("1234"));              // false
        System.out.println(checkWithRegex("1234567890987"));     // false
        System.out.println(checkWithRegex("123.456"));           // false
        System.out.println(checkWithRegex("abcdefg"));           // false
        System.out.println(checkWithRegex("0123456"));           // false
    }

    /**
     * 使用正则表达式，验证一个字符串是否是一个合法的QQ号码
     * @param str 字符串
     * @return 验证的结果
     */
    private static boolean checkWithRegex(String str) {
        return str.matches("[1-9]\\d{5,10}");
    }

    /**
     * 验证一个字符串是否是一个合法的QQ号码
     * @param str 字符串
     * @return 验证的结果
     */
    private static boolean check(String str) {
        // 1. 校验长度
        if (str.length() < 6 || str.length() > 11) {
            return false;
        }
        // 2. 校验纯数字组成
        try {
            Long.parseLong(str);
        }
        catch (NumberFormatException e) {
            // 说明不是纯数字，无法转成long型的变量
            return false;
        }
        // 3. 首字符校验
        return str.charAt(0) != '0';
    }
}
