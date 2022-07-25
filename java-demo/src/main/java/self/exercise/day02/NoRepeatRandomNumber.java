package self.exercise.day02;

import java.util.Arrays;

public class NoRepeatRandomNumber {
    public static void main(String[] args) {
        getNotNumber1();
        getNotNumber2();
    }

    public static void getNotNumber1(){
        //1. 声明整型数组
        int[] numbers=new int[10];
        //2. 思路： 通过一个while循环来不断生成随机数，通过for循环来剔除重复的随机数
        int index = 0;//初始化需要的随机数 个数
        while (true) {
            int random = (int)(Math.random() * 32 + 1); //生成随机数1~32
            int j = 0;//后面需要对 j 进行判断，需要提升为全局变量
            for ( ; j < numbers.length ; j++) { // 如果出现重复就跳出
                if(random == numbers[j]) break;
            }
            if(j == numbers.length ) numbers[index++] = random; // 说明没有重复，就可以存放随机数字到指定的位置了
            if (index == 10) break;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void getNotNumber2(){
        //1. 声明整型数组
        int[] numbers=new int[10];
        //2. 思路： 通过一个外层for循环来不断生成随机数，通过内层for循环来剔除重复的随机数
        for (int i = 0; i < 10; ) {
            int random = (int)(Math.random() * 32 + 1);
            int j = 0;
            for (; j < numbers.length; j++) {
                if (random == numbers[j]) break;

            }
            if(j == numbers.length ) numbers[i++] = random; // 说明没有重复，就可以存放随机数字到指定的位置了
        }
        System.out.println(Arrays.toString(numbers));
    }
}
