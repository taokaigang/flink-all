package day8.aExercise;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description 模拟实现Arrays.copyOf(int[] array, int newLength)方法
 */
public class Four {
    static int[] copyOf(int[] array, int newLength) {
        // 1. 实例化一个新的数组，新的数组的长度，是newLength
        int[] newArray = new int[newLength];
        // 2. 遍历数组，将array中的元素依次拷贝到这个新数组中，注意数组下标越界问题
        for (int i = 0; i < newArray.length && i < array.length; i++) {
            newArray[i] = array[i];
        }
        // 3. 返回这个新的数组
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] ret = copyOf(array, 15);
        System.out.println(Arrays.toString(ret));
    }
}
