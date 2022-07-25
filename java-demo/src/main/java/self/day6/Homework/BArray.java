package self.day6.Homework;

public class BArray {
    /**
     * 2. （中）设计一个方法，判断一个数组是不是一个升序的数组。
     * @param args
     */
    public static void main(String[] args) {
        int[] array1={10,20,30,40,50,60,70,80,90};
        int[] array2={70,80,90,60,50,40,30,20,10};
        boolean judge1 = isOrderAsc(array1,array1.length);
        boolean judge2= isOrderAsc(array2,array2.length);
        System.out.println(judge1);
        System.out.println(judge2);
    }

    /**
     *
     * @param array
     * @param index 最后一位索引
     * @return 验证结果
     */
    static boolean isOrderAsc(int[] array, int index) {
        if (index==1){
            return true;
        }else{
            return (array[index-1]<=array[index-2])? false: isOrderAsc(array,index-1);
        }
    }
}
