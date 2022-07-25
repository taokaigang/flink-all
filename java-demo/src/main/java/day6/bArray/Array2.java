package day6.bArray;

/**
 * 数组中的元素访问：
 *      元素：数组中存储的数据
 *      下标：元素在数组中的位置索引
 *      元素访问：通过下标访问，语法  数组[下标]
 * 注意！！！注意！！！注意！！！
 *      数组中，元素的下标是从0开始的！！！
 */
public class Array2 {
    public static void main(String[] args) {
        // 1. 实例化一个数组
        int[] array = { 1, 2, 3, 4, 5 };
        // 2. 获取数组中的首个元素
        int element = array[0];
        System.out.println(element);
        // 3. 修改数组中的最后一个元素为 100
        array[4] = 100;

        // 重点：如果使用错误的下标，进行元素访问，会出现异常：java.lang.ArrayIndexOutOfBoundsException
        System.out.println(array[5]);
    }
}
