package day8.aExercise;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description 设计一个方法，完成两个数组的拼接。将两个数组中的元素合并到一起。
 */
public class Two {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 10, 20, 30, 40, 50, 60, 70, 80};
        int[] ret = combine(arr1, arr2);
        System.out.println(Arrays.toString(ret));
    }

    static int[] combine(int[] arr1, int[] arr2) {
        // 1. 实例化一个新的数组，作为拼接之后的结果。新数组的长度应该是原来两个数组的长度和。
        int[] newArray = new int[arr1.length + arr2.length];
        // 2. 将第一个数组中的元素拷贝到新数组中。
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        // 3. 将第二个数组中的元素拷贝到新数组中。
        for (int i = 0; i < arr2.length; i++) {
            newArray[arr1.length + i] = arr2[i];
        }

        return newArray;
    }
}
