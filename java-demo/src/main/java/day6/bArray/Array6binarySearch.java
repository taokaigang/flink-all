package day6.bArray;

import java.util.Arrays;

/**
 * 数组元素查询
 */
public class Array6binarySearch {

    public static void main(String[] args) {
        // 1. 准备一个数组
        //int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(indexOf(array, 0));
        System.out.println(binarySearch(array, 0));

    }

    /**
     * 在数组中，查询指定的元素第一次出现的下标
     * @param array 要查询的数组
     * @param element 要查询的元素
     * @return 元素第一次出现的下标。如果这个元素不存在，返回-1
     */
    static int indexOf(int[] array, int element) {
        // 顺序查询：遍历每一个元素，用这个元素和要查询的数据进行对比
        for (int i = 0; i < array.length; i++) {
            // 用数组中的每一个元素和要查询的数据进行对比
            if (array[i] == element) {
                // 对比通过，返回下标
                return i;
            }
        }
        // 如果程序能走到这里，说明这个元素在数组中不存在，返回-1
        return -1;
    }

    /**
     * 使用二分查询，查询数组中指定元素出现的下标
     *      要求数组是【升序】的
     * @param array 需要查询的数组，要求排序
     * @param element 要查询的元素
     * @return 元素出现的下标
     */
    static int binarySearch(int[] array, int element) {
        // 1. 设置两个变量，用来表示范围的上限和下限。
        int minIndex = 0, maxIndex = array.length - 1;

        // 如果这个范围还在，就继续查询
        while (minIndex <= maxIndex) {
            // 2. 求中间下标
            int mid = (maxIndex + minIndex) / 2;
            // 3. 使用中间下标的元素，和要查询的元素做对比
            if (array[mid] > element) {
                // 说明要查询的元素，在左侧，修改上限
                maxIndex = mid - 1;
            }
            else if (array[mid] < element) {
                // 说明要查询的元素，在右侧，修改下限
                minIndex = mid + 1;
            }
            else {
                // 说明找到这个元素了
                return mid;
            }
        }
        // 如果循环走完了，说明查询的范围不断缩减，一直缩减到范围不存在了，还是没有找到这个元素
        // 说明这个元素不存在
        return -1;
    }
}
