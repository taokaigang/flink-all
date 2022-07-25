package day7.aExercise;

public class Seven {
    // 使用递归计算一个数组中的元素和。
    public static void main(String[] args) {
        //
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int sum = sum(array, array.length - 1);
        System.out.println(sum);
    }
    /**
     * 计算一个数组中，从第0位，到maxIndex位的元素的和
     * @param array 数组
     * @param maxIndex 最大下标
     * @return 计算的和
     */
    static int sum(int[] array, int maxIndex) {
        if (maxIndex == 0) {
            return array[0];
        }

        return sum(array, maxIndex - 1) + array[maxIndex];
    }
}
