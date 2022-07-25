package day11.aExercise;

import java.util.Arrays;
/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 *      System.arrayCopy(Object src, int srcPos, Object dst, int dstPos, int length);
 *          src、dst: 是一个数组，方法的作用是：将一个数组中的元素，从指定位开始，拷贝到另外一个数组中的指定位置，拷贝length个
 *          src: 原数组
 *          srcPos: 原数组中，需要拷贝的元素起始下标
 *          dst: 目标数组
 *          dstPos: 目标数组中，需要粘贴的元素的起始下标
 *          length: 拷贝的元素的数量
 */
public class ArrayCopyUsage {
    public static void main(String[] args) {
        int[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] dst = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        // 将src数组中的元素，从第3位开始拷贝，拷贝到dst数组中的第5位，拷贝4个元素
        // System.arraycopy(src, 5, dst, 3, 6);
        // System.out.println(Arrays.toString(dst));

        // 案例：删除src数组中的第5位元素
        System.arraycopy(src, 6, src, 5, 4);
        int[] ret = Arrays.copyOf(src, src.length - 1);
        System.out.println(Arrays.toString(ret));
    }
}
