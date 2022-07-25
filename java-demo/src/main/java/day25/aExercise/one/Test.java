package day25.aExercise.one;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description 【难】设计一个方法，计算一个文件夹的总大小（由所有的子文件、子文件夹中的子文件夹大小组成）
 */
public class Test {

    public static void main(String[] args) {
        long size = calculate(new File("C:\\Users\\luds\\Desktop\\"));
        System.out.println(size);
    }

    // 计算一个文件或者一个文件夹的大小
    public static long calculate(File file) {
        // 1. 判断这个file是否是一个目录
        if (file.isDirectory()) {
            // 遍历每一个子文件
            long size = 0;  // 记录总大小
            // 获取所有的子文件
            File[] files = file.listFiles();
            // 统计所有的子文件的大小
            if (files != null) {
                for (File f : files) {
                    size += calculate(f);
                }
            }
            return size;
        }
        else {
            return file.length();
        }
    }
}
