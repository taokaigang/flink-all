package self.day7;

import java.util.Arrays;
public class F {
    /**
     * 6. 【简】模拟实现Array.sort(int[]array)方法
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    static void sort(int[] array){
        //躺数 第一个指针箭头
        for (int i = 0; i < array.length - 1; i++) {
            //最小位指针
            int minIndex = i;
            //要比较的位指针
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
