package day4.cKeyword;

/**
 * break、continue:
 *      如果用在嵌套的循环中，只会对当前的循环生效。
 * 如果希望在内层循环中，使用break、continue，作用于外层循环：
 *      配合循环标签使用，给外层循环添加上一个循环标签，使用break、continue配合标签使用。
 */
public class Keyword2 {
    public static void main(String[] args) {
        // 嵌套循环
        // 循环标签：是一个标识符，一般情况下，全部大写。在这个标识符写完后，加上一个冒号。
        OUTER:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    break OUTER;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
