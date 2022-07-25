package self.day7;

import java.util.Arrays;
public class A {
    /**
     * 1. 【中】设计一个方法，删除一个数组中指定下标位的元素。返回删除之后的数组
     * @param args
     */
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] delArr= removeAt(arr,5);
        System.out.println(Arrays.toString(delArr));
    }

    static int[] removeAt(int[] arr, int index){
        if (index>0 || index < arr.length) {
            int[] newArr = new int[arr.length-1];
//            for (int i = 0; i < arr.length; i++) {
           for (int i = 0,j=0; i < arr.length; i++) {
               //如果成立则跳过了j++，而i++任然执行
                if (i==index){
                    continue;
                }
//                if (i == index)
//                    break;
               //j++很关键
                newArr[j++] = arr[i];
            }
//            for (int j = index+1; j < arr.length; j++) {
//                newArr[j-1] = arr[j];
//            }
            return newArr;
        }

        //越界则返回原数组
        return arr;
    }
}
