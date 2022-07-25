package self.day14.aExercise;

import java.util.Arrays;
import java.util.Random;

public class One {
    /**
     * 1. 设计一个方法，将一个数组中的元素随机排列。
     * @param args
     */
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,66,6,78,9,10};
        int[] newArray = randomArray(array);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] randomArray(int[] array){
        int[] newArray=new int[array.length];
        int[] tmp=randomNoRepetition(10,10);
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[tmp[i]-1];//(0,10]变为（-1,9]不包括-1
        }

        return newArray;
    }

    /**
     * 生成不重复的随机数
     * @param range 范围(0,range]
     * @param number 个数
     * @return 不重复的随机数数组
     */
    private static int[] randomNoRepetition(int range,int number){
        Random random=new Random();
        int[] tmp=new int[number];
        int count=0;
        while (count < number) {
            boolean flag=true;
            int r = random.nextInt(range+1);
            for (int i = 0; i < tmp.length; i++) {
                if (r == tmp[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                tmp[count]=r;
                //System.out.println(r);
                count++;
            }
        }
        return tmp;
    }

}
