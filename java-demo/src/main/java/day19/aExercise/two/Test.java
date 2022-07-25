package day19.aExercise.two;

import java.util.Scanner;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/16
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 将这些Student对象放进数组中
        Student[] students = one();
        // 2. 查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        two(students, name);
        // 3. 计算所有学生的平均年龄，最大年龄，最小年龄
        three(students);
        // 4. 如果存在名字叫张三的将名字改为张兵
        four(students, "张三", "张兵");
    }

    /**
     * 解析字符串，得到一个Student数组
     * @return Student数组
     */
    private static Student[] one() {
        String data = "01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
        // 1. 按照 * 切割出每一个人的信息
        String[] infos = data.split("\\*");
        // 2. 实例化一个Student数组，用来存放每一个Student对象
        Student[] students = new Student[infos.length];
        // 3. 遍历这个数组，将每一个部分的信息，转成Student对象
        for (int i = 0; i < infos.length; i++) {
            // 4. 将infos数组中的每一个元素，实例化一个Student对象，并存入结果数组中
            students[i] = new Student(infos[i]);
        }
        return students;
    }

    /**
     * 根据一个学生的名字，输出这个学生的信息
     * @param students 存有所有的学生对象的数组
     * @param name 学生的名字
     */
    private static void two(Student[] students, String name) {
        // 1. 获取到这个学生对象
        Student student = getStudentByName(students, name);
        // 2. 输出这个学生的信息
        System.out.println(student);
    }

    /**
     * 计算所有学生的最大年龄、最小年龄、平均年龄
     * @param students 学生对象数组
     */
    private static void three(Student[] students) {
        // 1. 假设第0个学生的年龄是最大的，同时也是最小的。
        int maxAge = students[0].getAge(), minAge = students[0].getAge(), sum = 0;
        // 2. 遍历数组中的每一个Student对象
        for (Student student : students) {
            // 计算新的年龄最大值
            maxAge = Math.max(student.getAge(), maxAge);
            // 计算新的年龄最小值
            minAge = Math.min(student.getAge(), minAge);
            // 累加年龄，求和
            sum += student.getAge();
        }
        // 3. 输出结果
        System.out.println("最大年龄: " + maxAge);
        System.out.println("最小年龄: " + minAge);
        System.out.println("平均年龄: " + (double)sum / students.length);
    }

    /**
     * 如果存在名字叫张三的将名字改为张兵
     * @param students 数组
     * @param oldName 原来的名字
     * @param newName 新的名字
     */
    private static void four(Student[] students, String oldName, String newName) {
        // 1. 通过名字查找到对象
        Student student = getStudentByName(students, oldName);
        // 2. 修改这个对象的名字
        if (student != null) {
            student.setName(newName);
        }
    }

    /**
     * 通过姓名，从一个学生对象数组数组中获取到学生对象
     * @param students 学生对象数组
     * @param name 要查询的名字
     * @return 学生对象，如果查不到，返回null
     */
    private static Student getStudentByName(Student[] students, String name) {
        // 遍历对象数组
        for (Student student : students) {
            // 校验名字是否相同
            if (student.getName().equals(name)) {
                // 找到了这个学生对象
                return student;
            }
        }
        // 说明数组中没有这个名字的学生
        return null;
    }
}