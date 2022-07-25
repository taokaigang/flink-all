package self.day19.aExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class One {
    /**
     * 1. 【中】设计一个方法，提取一个身份证号码中的生日部分。身份证号的验证规则，只需要验证前
     * 17位是数字，最后一位可以数字或者X即可。
     * @param args
     */
    public static void main(String[] args) {
        String ID="411328199612160699";
        getIDBirthday(ID);

    }

    private static void getIDBirthday(String ID){
        Pattern pattern=Pattern.compile("\\d{17}([\\dX])");
        Matcher matcher=pattern.matcher(ID);
        if(matcher.matches()){
            String substring = ID.substring(10, 14);
            System.out.println(substring);
        }
    }
}
