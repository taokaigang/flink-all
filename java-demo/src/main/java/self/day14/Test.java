package self.day14;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        Long l1=new Long(21000000);
//        Long l=Long.valueOf(21000000000L);
//        System.out.println(Math.pow(27,1/3.0));

//        Random random=new Random();
//        int tmp=0;
//        for (int i = 0; i < 10; i++) {
//            int r = random.nextInt(10);
//            if (tmp==r){
//                continue;
//            }else {
//                System.out.println(r);
//            }
//            tmp=r;
//        }
//        int[] array={1,2,3,4,5,66,6,78,9,10};
//        Random random=new Random();
//        int[] tmp=new int[array.length];
//        int count=0;
//        while (count < tmp.length) {
//            boolean flag=true;
//            int r = random.nextInt(array.length+1);
//            for (int i = 0; i < tmp.length; i++) {
//                if (r == tmp[i]) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag){
//                tmp[count]=r;
//                System.out.println(r);
//                count++;
//            }
//        }

//        int[] ints = randomNoRepetition(10, 4);
//        System.out.println(Arrays.toString(ints));
//    }
//    private static int[] randomNoRepetition(int bounds,int number){
//        Random random=new Random();
//        int[] tmp=new int[number];
//        int count=0;
//        while (count < number) {
//            boolean flag=true;
//            int r = random.nextInt(bounds);//[0,bounds)
//            for (int i = 0; i < tmp.length; i++) {
//                if (r == tmp[i]) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag){
//                tmp[count]=r;
//                //System.out.println(r);
//                ++count;
//            }
//        }
//        return tmp;
//    }

        byte c= (byte) 0b10000000;

        System.out.println(c);
    }
}
