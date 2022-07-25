package day7.aExercise;

public class Five {
    // 将一个数组中的元素拷贝到另外一个数组中。
    // 思路：遍历一个数组，依次将元素拷贝到指定的数组中。
    // 问题考虑：如果两个数组不一样长

    public static void main(String[] args) {
        int[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] dst = new int[5];
        copyTo(src, dst);

        for (int i : dst) {
            System.out.print(i + ", ");
        }
    }

    /**
     * 将原数组中的数据，依次拷贝到新的数组中
     * @param src 原数组
     * @param dst 目标数组
     */
    static void copyTo(int[] src, int[] dst) {
        for (int i = 0; i < src.length; i++) {
            if (i >= dst.length) {
                // 对另外一个数组的越界处理
                break;
            }
            dst[i] = src[i];
        }
    }
}
