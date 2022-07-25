package day8.aExercise;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/3/31
 * @Description 模拟实现 Arrays.toString(int[] array)方法
 */
public class Three {

    public static void main(String[] args) {
        int[] arr = { 1, 22, 333, 4444, 55555, 6, 7 };
        System.out.println(toString(arr));
        Arrays.sort(arr);
    }

    static String toString(int[] array) {
        if (array.length == 0) {
            return "[]";
        }
        // 1. 声明一个字符串，用来拼接最后的结果
        String str = "[";
        // 2. 遍历数组中的每一个元素，依次拼接到这个字符串中
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + ", ";
        }
        // 3. 注意：前面的元素后面是要添加一个逗号的，最后一个元素后面不需要拼接逗号
        //    额外拼接数组中的最后一位元素
        str += array[array.length - 1] + "]";

        return str;
    }
}
