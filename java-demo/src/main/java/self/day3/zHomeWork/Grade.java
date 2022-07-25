package self.day3.zHomeWork;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int i = scanner.nextInt();
        if (i<0 || i>100){
            System.out.println("输入错误成绩");
        }else if (i<60){
            System.out.println("C");
        }else if(i<80){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
    }

}
