package day7.aExercise;

public class Six {
    // 设计一个方法，比较两个数组中的元素是否相同（数量、每一个元素都相同，才认为是相同的数组）。
    static boolean equals(int[] array1, int[] array2) {
        // 1. 先比较长度
        if (array1.length != array2.length) {
            return false;
        }
        // 2. 依次比较元素
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        // 1. 准备两个数组
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        System.out.println(equals(array1, array2));
    }
}
