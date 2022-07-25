package day2.aVariable;

/**
 * 转义字符的使用 \
 *      1. 配合某些具有特殊含义的字符使用，使其变得没有特殊含义，变成一个普通字符。
 *      2. 配合某些普通字符使用，使其变得具有特殊含义
 *          常见的： \n: 代表换行符    \r: 代表回车符     \t: 代表制表符（TAB）
 */
public class Convert {

    //通用分隔符 适用于linux/win/macos 跨操作系统运行
    private static final String lineSeparator = System.lineSeparator();

    public static void main(String[] args) {
        // 1. 在字符中的使用
        char c = '\'';
        System.out.println(c);

        // 2. 在字符串中的使用
        String s = "\"";
        System.out.println(s);

        // 3. 小练习：在控制台输出:  C:\Windows\Files("x64")\
        System.out.println("C:\\Windows\\Files(\"x64\")\\");

    }
}
