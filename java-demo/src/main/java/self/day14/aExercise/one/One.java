package self.day14.aExercise.one;

import java.util.Arrays;

public class One {
    /**
     *1.设计一个方法，#将一个数组中的元素随机排列。
     * @param args
     */
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        MyArrayTools.shuffle(array);
        System.out.println(Arrays.toString(array));
    }
}
