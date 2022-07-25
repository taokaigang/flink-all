package day2.bConvert;

/**
 * 注意事项：
 *      所有的 byte、short、char 类型的变量，在参与运算的时候，会自动的提升为int类型，运算结果也是int类型。
 */
public class ConvertType2 {
    public static void main(String[] args) {
        // 数据类型转换
        byte a = 10, b = 20;
        byte c = (byte) (a + b);
        System.out.println(c);
    }
}
