package day7.aExercise;

public class Three {
    // 设计一个方法，找出一个整型数组中的第二大的值。
    // 1. 不可以通过排序实现，不能修改数组中的数据顺序
    // 2. 要考虑到最大的数字可能出现多次
    public static void main(String[] args) {
        //
        int[] array = { 1, 3, 5, 7, 9, 9, 9, 9, 7, 7, 7, 9, 6, 0 };

        int second = getSecondMax(array);
        System.out.println(second);
    }

    /**
     * 查询一个数组中第二大的值
     * 核心思路：定义两个变量，一个用来记录最大值，一个用来记录次大值。
     *         遍历数组中的每一个元素，用元素和最大值、次大值进行比较。更新最大值、次大值。
     * @param array 数组
     * @return 结果
     */
    static int getSecondMax(int[] array) {
        // 空数组判断
        if (array.length == 0) {
            System.out.println("数组是一个空数组，没有次大值");
            return -1;
        }
        else if (array.length == 1) {
            System.out.println("数组中只有一个元素！");
            return array[0];
        }

        // 定义两个变量，分别记录最大值和次大值
        // 将数组前两位元素的比较结果，分别给最大值和次大值赋值
        int max = array[0] > array[1] ? array[0] : array[1];
        int second = array[0] < array[1] ? array[0] : array[1];

        // 遍历数组中的每一个元素
        for (int i = 2; i < array.length; i++) {
            // 获取第i位的元素
            int element = array[i];
            // 比较element与max、second的大小关系
            if (element > max) {
                second = max;
                max = element;
            }
            else if (element < max && element > second) {
                second = element;
            }
        }
        return second;
    }
}
