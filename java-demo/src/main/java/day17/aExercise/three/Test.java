package day17.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(check("123456"));            // true
        System.out.println(check("1234"));              // false
        System.out.println(check("1234567890987"));     // false
        System.out.println(check("123.456"));           // false
        System.out.println(check("abcdefg"));           // false
        System.out.println(check("0123456"));           // false
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

        /*
        for (int i = 0; i < str.length(); i++) {
            // 依次获取每一个字符
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                // 说明出现了非数字的字符
                return false;
            }
        }
         */

        // 3. 首字符校验
        return str.charAt(0) != '0';
    }
}
