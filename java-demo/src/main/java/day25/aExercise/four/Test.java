package day25.aExercise.four;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //
        deleteDir(new File("C:\\Users\\luds\\Desktop\\富强"));
    }

    // 设计一个方法，删除一个文件夹中的所有的内容，包括这个文件夹本身。
    public static void deleteDir(File dir) {
        // 1. 获取一个目录下所有的子文件(夹)
        File[] files = dir.listFiles();
        // 2. 遍历数组进行删除
        for (File file : files) {
            // 2.1. 判断这个file是否是一个子目录
            if (file.isDirectory()) {
                // 递归调用方法，删除自己
                deleteDir(file);
            }
            // 2.2. 如果是子目录，经过2.1也就变成一个空的文件夹了
            file.delete();
        }
        dir.delete();
    }
}
