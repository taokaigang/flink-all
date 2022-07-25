package self.day18aExercise.two;

import java.util.Arrays;
import java.util.Scanner;

public class Two {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //2. 【难】如下字符串：
        String str="01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
        String[] split = str.split("\\*+");
        //System.out.println(Arrays.toString(split));
        //System.out.println(Arrays.toString(split[0].split("#+")));
        //创建Student类，属性：学号 姓名 年龄
        Student[] students=new Student[split.length];
        for (int i = 0; i < split.length; i++) {
            students[i]= new Student(split[i]);
        }

        //2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
        Scanner scanner=new Scanner(System.in);
        String nextLine = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentInfo(nextLine);
        }

        //3.计算所有学生的平均年龄，最大年龄，最小年龄
        double avg=0;
        for (int i = 0; i < students.length; i++) {
            avg += students[i].getAge();
        }
        avg=avg/students.length;
        System.out.println(avg);

        int max=students[0].getAge();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() > max){
                max=students[i].getAge();
            }
        }
        System.out.println(max);
        int min=students[0].getAge();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() < min){
                min=students[i].getAge();
            }
        }
        System.out.println(min);

        //4.如果存在名字叫张三的将名字改为张兵
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals("张三")){
                students[i].setName("张兵");
                System.out.println(students[i]);
            }
        }
    }
}
