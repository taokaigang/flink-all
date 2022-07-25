package day8.aExercise;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description 设计一个方法，删除一个数组中指定下标位的元素。返回删除之后的数组。
        */
public class One {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] ret = removeAt(array, 5);
        System.out.println(Arrays.toString(ret));
    }

    static int[] removeAt(int[] array, int index) {
        // 1. 检测这个下标是否越界。
        if (index < 0 || index >= array.length) {
            return array;
        }
        // 2. 实例化一个新的数组，新数组的长度是原数组的长度-1。
        int[] newArray = new int[array.length - 1];
        // 3. 将原数组中的元素，依次拷贝到新的数组中。
        //    使用i遍历原数组，使用j遍历新数组
        for (int i = 0, j = 0; i < array.length; i++) {
            // 4. 在拷贝的过程中，如果遇到了需要删除的下标，这一位的元素不拷贝。
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }

        return newArray;
    }
}
