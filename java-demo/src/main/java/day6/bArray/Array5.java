package day6.bArray;

/**
 * 数组排序
 */
public class Array5 {
    public static void main(String[] args) {
        // selectSort1();
        // selectSort2();
        bubbleSort();
    }

    static void selectSort1() {
        // 1. 准备一个需要排序的数组
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        // 2. 选择排序

        // 1. 固定下标，用这个下标对应的元素，依次和后面的每一个元素进行比较
        for (int i = 0; i < array.length - 1; i++) {
            // 2. 内层循环，从固定下标位的后一位开始，一直到数组的最后一位
            for (int j = i + 1; j < array.length; j++) {
                // 3. 比较两位的元素
                if (array[i] > array[j]) {
                    // 交换元素
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    static void selectSort2() {
        // 1. 准备一个数组
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        // 2. 固定一个下标，一直到倒数第二位
        for (int i = 0; i < array.length - 1; i++) {
            // 2.1. 定义一个变量，用来记录最小值的下标
            int minIndex = i;
            // 2.2. 从i+1位开始，依次遍历后面的每一个元素，一直到数组的最后一个元素
            for (int j = i + 1; j < array.length; j++) {
                // 2.3. 使用最小值下标对应的元素，和当前遍历的元素，进行比较
                if (array[minIndex] > array[j]) {
                    // 2.4. 说明新的最小值出现了
                    minIndex = j;
                }
            }
            // 2.5. 内层循环走完后，minIndex就指向了数组中的一个最小值，交换这个最小值和第i位的值
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    static void bubbleSort() {
        // 冒泡排序：每一趟比较，都从第0位开始，依次比较两个相邻的元素。
        int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        // 外层循环，用来控制发生多少趟的排序，数组的长度-1趟排序
        for (int i = 0; i < array.length - 1; i++) {
            // 内层循环，每次都从第0位开始，每一位的元素和后面一位的元素进行比较
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 比较两个相邻的元素
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
