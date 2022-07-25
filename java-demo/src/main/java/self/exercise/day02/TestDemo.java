package self.exercise.day02;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        //1. 数组存放一注的结果
        int[] balls = new int[7];
        //2.随机篮球
        int blue = (int)(Math.random() * 16 + 1);
        balls[balls.length - 1] = blue;


        int index = 0;
        /*while (true) {
            int red = (int)(Math.random() * 32 + 1); //1
            int j = 0;
            for (;j < balls.length - 1;j++) { // 如果出现重复就跳出
                if(red == balls[j]) break;
            }
            if(j == balls.length - 1) balls[index++] = red; // 说明没有重复，就可以存放红球到指定的位置了
            if (index == 6) break;
        }*/


        for (index=0; index <= 6;){
            int red = (int)(Math.random() * 32 + 1); //1
            int j = 0;
            for (;j < balls.length - 1;j++) { // 如果出现重复就跳出
                if(red == balls[j]) break;
            }
            if(j == balls.length - 1) balls[index++] = red; // 说明没有重复，就可以存放红球到指定的位置了
        }


        //3. 打印
        System.out.println(Arrays.toString(balls));
    }
}
