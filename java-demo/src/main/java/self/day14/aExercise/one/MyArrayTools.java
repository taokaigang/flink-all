package self.day14.aExercise.one;

import java.util.Random;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/11
 * @Description 操作数组的类，对一个数组中的元素进行一些处理。仿照 Arrays 工具类。
 */
public class MyArrayTools {
    /**
     * 对一个数组中的元素进行随机排列
     *
     * 思路：
     *      1. 遍历数组，用遍历到的下标位的元素，和一个随机的下标位的元素进行交换。
     *      2. 洗牌法：
     *          2.1. 将原数组中的元素备份一份出去，到一个新的数组中
     *          2.2. 随机一个下标，从这个新的数组中获取元素
     *          2.3. 将这个获取到的随机的元素存入到原来数组中，并将它从备份数组中移除
     *
     * @param array 需要随机排列的数组
     */
    public static void shuffle(int[] array) {
        // 0. 准备一个随机数对象
        Random random = new Random();
        // 1. 遍历数组
        for (int i = 0; i < array.length; i++) {
            // 2. 生成一个随机的下标，随机范围 [0, array.length)
            int index = random.nextInt(array.length);
            // 3. 交换元素，交换第 i 位和这个随机位的元素
            int tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }
    }
}
