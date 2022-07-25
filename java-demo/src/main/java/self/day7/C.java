package self.day7;

import java.util.Arrays;
public class C {
    /**
     * 3. 【简】模拟实现Arrays.toString(int[]array)方法
     * @param args
     */
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        String s = toString(arr);
        System.out.println(s);
    }
    static String toString(int[] array){
//        String str="";
//        for (int i = 0; i < array.length; i++) {
//
//            if (i==0){
//                str+="["+array[0]+", ";
//            }else if (i==array.length-1){
//                str +=array[array.length-1]+"]";
//            }else {
//                str += array[i]+", ";
//            }
//        }
//        return str;
        if (array.length==0){
            return "[]";
        }

        String str="[";
        for (int i = 0; i < array.length-1; i++) {
            str += array[i]+", ";
        }
        str += array[array.length-1]+"]";
        return str;
    }
}
