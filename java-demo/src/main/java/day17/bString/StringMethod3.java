package day17.bString;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description
 */
public class StringMethod3 {
    public static void main(String[] args) {

        // 将若干个字符串拼接到一起，在拼接的时候，元素与元素之间以指定的分隔符进行分隔
        String str1 = String.join(", ", "lily", "lucy", "uncle wang", "polly");
        System.out.println(str1);

        float score = 100;
        String name ="xiaoming";
        int age = 19;
        // 大家好，我叫xiaoming，今年19岁了，本次考试考了100分。
        /**
         * 常见占位符:
         * %s : 替代字符串       -> %ns: 凑够n位字符串，如果不够，补空格
         * %d : 整型数字占位符    -> %nd: 凑够n位，如果不够补空格。
         * %f : 浮点型数字占位符  -> %.nf: 保留小数点后面指定位的数字
         * %c : 字符型占位符
         */
        String str2 = String.format("大家好，我叫%11s，今年%03d岁了，本次考试考了%.6f分。", name, age, score);
        System.out.println(str2);
    }
}
