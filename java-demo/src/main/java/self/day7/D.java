package self.day7;

import java.util.Arrays;
public class D {
    /**
     * 4. 【中】模拟实现Arrays.copyOf(int[]array,int newLength)方法
     * @param args
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] array = Arrays.copyOf(arr, 12);
        System.out.println(Arrays.toString(array));

        int[] array2 = copyOf(arr, 12);
        System.out.println(Arrays.toString(array2));
    }
    static int[] copyOf(int[] array, int newLength){
        int[] newArray=new int[newLength];

//        int len=0;
//        if (newLength>=array.length){
//            len=array.length;
//        }else {
//            len=newLength;
//        }
//        for (int i = 0; i < len; i++) {
//                newArray[i]=array[i];
//        }
        for (int i = 0; i < newArray.length; i++) {
            //i
            if(i<array.length){
                newArray[i]=array[i];
            }
        }


        return newArray;
    }
}
