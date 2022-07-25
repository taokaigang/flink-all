package day18.cRegex;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description
 */
public class Regex4 {
    public static void main(String[] args) {
        // 需求: 匹配一个字符串可以是 126 或者是 163 或者是 qq 或者是 QQ
        System.out.println("123".matches("126|163|qq|QQ"));
        // 需求: 匹配一个qq邮箱、126邮箱、163邮箱
        System.out.println("admin@sina.com".matches("admin@(qq|126|163)\\.com"));

    }
}
