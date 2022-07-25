package day7;

import java.util.Arrays;

/**
 * Arrays工具类：是一个用来操作数组的工具类。
 * 在这个类中，封装了很多很多的用来操作数组的方法。
 *
 * Arrays.fill(int[] array, int val)                    : 使用指定的数据，填充一个数组
 * Arrays.toString(int[] array)                         : 将一个数组转成字符串表示形式
 * Arrays.copyOf(int[] array, int newLength)            : 将一个数组中的元素，拷贝指定位到一个新数组中
 * Arrays.copyOfRange(int[] array, int from, int to)    : 将一个数组中的元素，拷贝[from, to)范围的数据到新的数组中
 * Arrays.sort(int[] array)                             : 将一个数组中的元素进行升序排列
 * Arrays.equals(int[] array1, int[] array2)            : 判断两个数组中的元素是否是相同的
 *
 * Arrays.binarySearch(int[] array, int key)            : 使用二分查找法，在一个升序的数组中，查询key出现的下标
 */
public class cArrays {
    public static void main(String[] args) {
        // 1. 实例化一个数组
        int[] array = { 5, 4, 3, 2, 1 };
        int[] array2 = { 5, 4, 3, 2, 1 };

        // 2. Arrays工具类的使用
        // 2.1. 填充
        // Arrays.fill(array, 0);
        // 2.2. 元素拷贝（生成新的数组）
        // int[] ret = Arrays.copyOf(array, 10);
        // 2.3. 元素拷贝
        // int[] ret = Arrays.copyOfRange(array, 2, 10);
        // 2.4. 数组排序
        // Arrays.sort(array);
        // 2.5. 比较两个数组中的元素是否是相同的
        // boolean ret = Arrays.equals(array, array2);

        // 2.6.
        int index = Arrays.binarySearch(array, 1);
        System.out.println(index);

        // 2.2. 将数组中的元素转成对应的字符串（由所有的元素拼接起来的）
        // System.out.println(Arrays.toString(ret));

    }
}
