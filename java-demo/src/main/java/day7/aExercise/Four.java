package day7.aExercise;

public class Four {
    // 设计一个方法，将一个数组中的元素倒序排列（注意，不是降序）。
    // 思路：将数组中的第0个元素和最后一个元素交换、第1个元素和倒数第二个元素交换、...
    //      将数组中的元素，镜像位进行交换即可。交换，只需要进行数组长度一半次即可。
    public static void main(String[] args) {
        //
        int[] array = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        reverse(array);
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    static void reverse(int[] array) {
        // 交换，只需要将元素遍历到数组的一半即可。如果再向后遍历，前半部分进行的交换，又换回来了。
        for (int i = 0; i < array.length / 2; i++) {
            // 0  array.length - 1
            // 1  array.length - 2
            // 2  array.length - 3
            // 交换第i位的元素和第array.length - 1 - i位的元素
            int tmp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tmp;
        }
    }

    // 以下方法，只是定义了一个新的数组，将倒序之后的元素存入到了新数组中
    // 新数组中的元素，的确是倒序之后的数据，但是和原数组没有关系了。原数组是不会有变化的。
    static int[] reverse2(int[] array) {
        // 1. 实例化一个新的数组，新数组的长度和原数组长度相同
        int[] newArray = new int[array.length];
        // 2. 正序遍历原数组，倒序往新数组中存
        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }

        // for (int i = 0, j = newArray.length - 1; i < array.length; i++, j--) {
        //     newArray[j] = array[i];
        // }

        // for (int i = 0; i < array.length; i++) {
        //     array[i] = newArray[i];
        // }

        return newArray;
    }
}
