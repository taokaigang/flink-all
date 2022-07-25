package day8.aExercise;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description 模拟实现Arrays.copyOfRange(int[] array, int from, int to)方法
 */
public class Five {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] ret = copyOfRange(array, 13, 17);
        System.out.println(Arrays.toString(ret));
    }

    static int[] copyOfRange(int[] array, int from, int to) {
        // 1. 实例化一个新的数组，新的数组长度是 to-from
        int[] newArray = new int[to - from];
        // 2. 遍历数组，从第from位开始，到to位，依次拷贝到新的数组中。注意数组下标越界问题。
        for (int i = from; i < to && i < array.length; i++) {
            newArray[i - from] = array[i];
        }
        return newArray;
    }

}
