package self.day6.Homework;

public class GArray {
    /**
     *  7. （中）使用递归计算一个数组中的元素和。
     * @param args
     */
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,60,70,80,90};
        System.out.println(sumArray(array,0));
    }

    static int sumArray(int[] array,int begin) {
        if(array.length-1==begin)
            return array[begin];
        return array[begin]+sumArray(array,begin+1);
    }
    static int sumArray2(int[] arr,int end){
        if(end==1){
            arr[end]=arr[0];
        }
        return sumArray2(arr,end-1);
    }
}
