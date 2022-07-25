package day7.aExercise;

public class One {

    public static void main(String[] args) {
        show(new int[]{ 1, 2, 3, 4, 5, 5 });
        show(new int[]{ 1, 3, 5, 7, 9 });
    }

    // 设计一个方法，找出一个数组中最大的数字，连同所在的下标一起输出。
    static void show(int[] array) {
        // 1. 定义一个变量，用来记录数组中的最大值
        //    假设第0个元素是最大值。
        //    遍历数组中，从第1个元素开始，后面的每一个元素。如果找到的比max更大的值，更新max即可。
        int max = array[0];
        // 2. 定义一个变量，用来记录数组中的最大值的下标
        //    假设第0个元素是最大值。
        //    遍历数组中，从第1个元素开始，后面的每一个元素。如果找到的比max更大的值，更新max的同时，更新最大值所在的下标。
        int maxIndex = 0;
        // 3. 从数组中第1位元素开始，遍历后面的每一个元素
        for (int i = 1; i < array.length; i++) {
            // 依次用数组中的每一位元素，和当前记录的最大值max进行比较
            if (array[i] > max) {
                // 更新新的最大值
                max = array[i];
                // 更新新的最大值所在下标
                maxIndex = i;
            }
        }
        System.out.println("数组中的最大值是：" + max + ", 所在的下标是：" + maxIndex);
    }
}
