package day6.bArray;

/**
 * 数组的元素遍历
 *
 *      常见的方式：下标遍历、增强for循环
 *
 *      下标遍历：
 *          优点：
 *              1. 可以在遍历的同时，获取到元素对应的下标。
 *              2. 在遍历的过程中，通过下标修改指定位的元素。
*           缺点：
 *              1. 效率没有增强for循环高。
 *
*       增强for循环：
 *          优点：
 *              1. 效率比下标遍历高。
*           缺点：
 *              1. 遍历过程中，不知道当前元素的下标是多少。
 *              2. 遍历过程中，不能修改元素。
 */
public class Array4 {

    public static void main(String[] args) {
        // 1. 实例化一个数组
        int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        // index(array);
        // forEach(array);

        // 2. TIPS: IDEA的使用
        // array.for
        // array.fori
        // array.forr
    }

    /**
     * 下标遍历
     */
    static void index(int[] array) {
        // 1. 遍历数组中的每一个下标
        for (int i = 0; i < array.length; i++) {
            // 2. 通过下标，获取对应的元素
            System.out.println(array[i]);
        }
    }

    /**
     * 增强for循环
     * @param array 需要遍历的数组
     */
    static void forEach(int[] array) {
        // 语法: for (元素的类型 标识符 : 数组) {}
        // 逻辑: 依次获取数组中的每一个元素，依次给ele进行赋值
        for (int ele : array) {
            System.out.println(ele);
        }
    }
}
