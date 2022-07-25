package self.day19.aExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {
    /**
     * 2. 【中】设计一个方法，将如下字符串中的所有手机号码和固话号码提取出来，存入一个数组返回。
     *      1. 手机号码的校验: 首位是1，第二位是 3579，后面都是数字
     *      2. 固化校验: 区号-号码，其中区号3或4位，号码7位，且首位不能是0
     *      3. 待提取数据的字符串:
     * @param args
     */
    public static void main(String[] args) {
        String str="17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123";
        Pattern pattern1=Pattern.compile("1([3579])(\\d{9})");
        Pattern pattern2=Pattern.compile("(\\d{3}|\\d{4})([-])([1-9])(\\d{6})");
        Matcher matcher1=pattern1.matcher(str);
        Matcher matcher2=pattern2.matcher(str);
//        while (matcher1.find()){
//            System.out.println(matcher1.group());
//        }
//        while (matcher2.find()){
//            System.out.println(matcher2.group());
//        }
        Pattern pattern=Pattern.compile("(1([3579])(\\d{9}))|((\\\\d{3}|\\\\d{4})([-])([1-9])(\\\\d{6}))");
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
