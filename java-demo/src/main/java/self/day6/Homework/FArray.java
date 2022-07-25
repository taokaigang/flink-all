package self.day6.Homework;

public class FArray {
    /**
     * 6. （易）设计一个方法，比较两个数组中的元素是否相同（数量、每一个元素都相同，才认为是相同
     * 的数组）。
     * @param args
     */
    public static void main(String[] args) {
            int[] arr1={10,20,30,40,50,60,70,80,90};
            int[] arr2={10,20,30,40,50,60,70,80,90};
            int[] arr3={10,20,30,};
            int[] arr4={10,30,20,40,50,60,70,80,90};
        System.out.println(compareArrayAlike(arr1,arr2));
        System.out.println(compareArrayAlike(arr1,arr3));
        System.out.println(compareArrayAlike(arr1,arr4));

    }
    static boolean compareArrayAlike(int[] arrOne,int[] arrTwo) {

        if(arrOne.length!=arrTwo.length){
            return false;
        }
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i]!=arrTwo[i]){
                return false;
            }
        }
        return true;
    }
}
