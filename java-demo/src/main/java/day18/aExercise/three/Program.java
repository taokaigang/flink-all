package day18.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description     【简】设计一个方法，将一个字符串中的大小写字母翻转。
 */
public class Program {
    public static void main(String[] args) {

        System.out.println(reverse("hello WORLD"));
    }

    private static String reverse(String str) {
        // 1. 将字符串转成字符数组
        char[] array = str.toCharArray();
        // 2. 遍历数组中的每一个元素
        for (int i = 0; i < array.length; i++) {
            // 得到每一个字符
            char c = array[i];
            // 判断大小写
            if (Character.isUpperCase(c)) {
                array[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                array[i] = Character.toUpperCase(c);
            }
        }

        return new String(array);
    }
}
