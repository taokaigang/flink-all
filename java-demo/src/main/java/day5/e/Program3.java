package day5.e;

public class Program3 {
    // 使用递归计算前30位的斐波那契数列
    public static void main(String[] args) {

        for (int index = 1; index <= 50; index++) {
            System.out.println(index + ": " + getNumber(index));
        }

    }

    /**
     * 计算第 index 位的斐波那契数列中的值
     * @param index 位数
     * @return 这一位的数字
     */
    static int getNumber(int index) {

        if (index == 1 || index == 2) {
            return 1;
        }

        return getNumber(index - 1) + getNumber(index - 2);
    }
}

