package day18.cRegex;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description 正则表达式的基础语法
 */
public class Regex2 {
    public static void main(String[] args) {
        // 校验规则:
        // System.out.println(",ello".matches("[ahj1,8]ello"));
        // System.out.println("fello".matches("[a-z]ello"));
        // 需求: 首位字符，可以是任意的小写字母，或者是 HAQ
        // System.out.println("Hello".matches("[Ha-zAQ]ello"));
        // 需求: 首位字符，可以是任意的字母，包括大写字母和小写字母
        // System.out.println("hello".matches("[a-zA-Z]ello"));
        // 需求: 首位字符，可以是除了h之外的任意字符
        // System.out.println("Hello".matches("[^hel]ello"));
        // 需求: 首位字符，不可以是任意的小写字母，但是 h、e、q 除外
        // System.out.println("lello".matches("[^a-z[heq]]ello"));

        // 希望首位字符，可以是 h e [
        // System.out.println("]ello".matches("[he\\[]ello"));
        // 希望首位字符，可以是 a - z
        // System.out.println("hello".matches("[az-]ello"));

        System.out.println("hello".matches("hel+o"));
        System.out.println("hello".matches("hel?o"));
        System.out.println("heo".matches("hel*o"));

        System.out.println("hello".matches("hel{3}o"));
        System.out.println("hello".matches("hel{3,}o"));
        System.out.println("hello".matches("hel{3,5}o"));
    }
}

