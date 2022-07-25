package self.day6.sort;

/**
 * 每一趟【选择】最小的
 */
public class SelectSort {
    public static void main(String[] args) {
        SelectSort2();
    }

    private static void SelectSort2() {//增加了一个指针minIndex（指向每一趟的最小值）用来减少交换次数
        int[] arr={9,8,7,6,5,4,3,2,1,0};

        //从第一个到倒数第二个  总趟数
        for (int i = 0; i < arr.length-1; i++) {

            int minIndex=i;//刚开始 指向每一趟的第一个数
            //找到最小值
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[i];//交换
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }
}
