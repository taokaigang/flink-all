package day7.aExercise;

public class Two {
    // 设计一个方法，判断一个数组是不是一个升序的数组。
    // 思路：假设所有的数组都是升序的，从第0个元素开始，依次用每一个元素和后面的一位元素进行比较
    //      如果比较结果，前面的元素比后面的元素大。足以说明数组不是一个升序数组
    static boolean checkAsc(int[] array) {
        // 从第0个元素开始，依次遍历每一个元素，和后面的元素进行比较
        for (int i = 0; i < array.length - 1; i++) {
            // 用遍历到的元素和后面的元素进行比较
            if (array[i] > array[i + 1]) {
                // 足以证明这个数组不是一个升序的数组
                return false;
            }
        }
        // 如果方法可以走到这里，可以说明这个数组是一个升序的数组

        // 如果认为一个数组中，所有的元素都相同的情况下，不应该是一个升序的数组
        // 此时使用下面的验证，验证数组的最后一位需要大于数组的第0位的元素
        // return array[array.length - 1] > array[0];

        // 如果当数组中所有的元素都相同的情况下，依然视为是升序的数组
        return true;
    }


    /**
     * 使用递归的思路验证
     * 1. 如果数组中的最后一位元素，比数组中的倒数第二位元素大。并且同时，数组从第0位，到倒数第二位，是升序的。此时，就可以认为整个数组是升序的。
     * 2. 在判断数组的第0位到倒数第二位是升序的，过程中，可以使用当前方法来判断。
     * @return 验证结果
     */
    static boolean check(int[] array, int maxIndex) {
        if (maxIndex == 0) {
            return true;
        }
        return array[maxIndex] > array[maxIndex - 1] && check(array, maxIndex - 1) ;
    }


    public static void main(String[] args) {

        // 1. 准备一个数组
        int[] array = { 1, 2, 3, 4, 3, 5, 6, 7, 8, 9 };

        // System.out.println(checkAsc(array));
        System.out.println(check(array, array.length -  1));
    }
}
