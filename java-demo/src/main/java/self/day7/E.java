package self.day7;

import java.util.Arrays;
public class E {
    /**
     * 5. 【中】模拟实现Arrays.copyOfRange(int[]array,intfrom,intto)方法
     * @param args
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] array = Arrays.copyOfRange(arr, 5,12);
        System.out.println(Arrays.toString(array));

        int[] array2 = copyOfRange(arr, 5,12);
        System.out.println(Arrays.toString(array2));
    }
    static int[] copyOfRange(int[] array, int from, int to){
        int[] newArray=new int[to-from];

        for (int i = 0; i < newArray.length; i++) {
            //
            if(i+from < array.length){
                newArray[i]=array[i+from];
            }
        }
        return newArray;
    }
}
