package day20.aExercise.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        String birthday = getBirthdayStr("123456200201309999");
        System.out.println(birthday);
    }
    /**
     * 提取一个身份证号码中的生日部分
     * @param id 身份证号码
     * @return 身份证号码的生日部分
     */
    private static String getBirthdayStr(String id) {
        // 1. 写身份证校验的正则
        // 这里添加了生日部分的较详细的验证:
        // 1. 年部分: 19XX 或 20XX
        // 2. 月部分: 01 - 12
        // 3. 日部分: 01 - 31
        String regex = "[1-9]\\d{5}(19|20)(\\d{2})(0[1-9]|1[012])([012][1-9]|10|20|30|31)\\d{3}[\\dxX]";
        // 2.
        Matcher matcher = Pattern.compile(regex).matcher(id);
        if (matcher.matches()) {
            String year = matcher.group(1) + matcher.group(2);
            String month = matcher.group(3);
            String day = matcher.group(4);

            return String.format("%s年%s月%s日", year, month, day);
        }
        // 说明不是一个合法的身份证号码，无法提取出来生日部分。
        throw new WrongIdException();
    }
}

class WrongIdException extends RuntimeException {}
