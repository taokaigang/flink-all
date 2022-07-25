package self.day7;

import java.util.Arrays;
public class B {
    /**
     * 2. 【中】设计一个方法，完成两个数组的拼接。将两个数组中的元素合并到一起
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,0,10};
        int[] combine = combine(arr1, arr2);
        System.out.println(Arrays.toString(combine));

    }
    static int[] combine(int[] arr1, int[] arr2){
        int[] newArr=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i+arr1.length]=arr2[i];
        }
        return newArr;
    }
}
