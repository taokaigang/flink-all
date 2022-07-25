package self.day6.Homework;


public class DArray {
    /**
     * 4. （中）设计一个方法，将一个数组中的元素倒序排列（注意，不是降序）。
     * @param args
     */
    public static void main(String[] args) {
        int[] array={1,2,3,54,67,87,79,70,90};
        int[] ints = reverseArray(array);
        for (int ele : ints) {
            System.out.println(ele);
        }
    }

    static int[] reverseArray(int[] array) {
        int midIndex=array.length/2;

        for (int i = 0; i < midIndex; i++) {
                int temp=array[i];
                array[i]=array[array.length-i-1];
                array[array.length-i-1]=temp;
        }
        return array;
    }
}
