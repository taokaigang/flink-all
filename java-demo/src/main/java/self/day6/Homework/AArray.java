package self.day6.Homework;

public class AArray {
    /**
     * 1. （易）设计一个方法，找出一个数组中最大的数字，连同所在的下标一起输出。
     * @param args
     */
    public static void main(String[] args) {
        int[] array={19,20,30,40,50,29,89,49,77};

        int maxIndex = findMaxIndex(array);
        System.out.println(maxIndex);
        System.out.println(array[maxIndex]);
    }

    static int findMaxIndex(int[] arr){
        int maxIndex=0;
        //for (int i = 0; i < arr.length; i++) {
        //可以从数组中第一位元素开始
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
