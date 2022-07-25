package self.day6.Homework;

public class CArray {
    /**
     *3. （难）设计一个方法，找出一个整型数组中的第二大的值。
     * 3.1. 不可以通过排序实现，不能修改数组中的数据顺序
     * 3.2. 要考虑到最大的数字可能出现多次
     * @param args
     */
    public static void main(String[] args) {
        int[] array={10,20,40,70,70,69,80,91,90,91,91};

        System.out.println(SecondMax(array));
    }

//有问题，错误
    static int SecondMax(int[] array) {
        int max=0,second=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                second=max;
                max=array[i];
            }
            else if(array[i]>second){
                second=array[i];
            }
        }
        return second;
    }




}
