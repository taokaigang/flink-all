package self.day6.Homework;

public class EArray {

    /**
     *5. （易）将一个数组中的元素拷贝到另外一个数组中。
     * @param args
     */
    public static void main(String[] args) {
            int[] arr={10,20,3,4,0,450,70,9,60,50,90};
            int[] arrCopy=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i]=arr[i];
        }
        for (int ele : arrCopy) {
            System.out.println(ele);
        }

    }
}
