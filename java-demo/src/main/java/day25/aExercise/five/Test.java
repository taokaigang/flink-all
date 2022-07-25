package day25.aExercise.five;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        showDir(new File("C:\\Users\\luds\\Desktop\\a"), 0);
    }
    // 列举一个文件夹下的所有的子文件、子目录
    public static void showDir(File dir, int level) {
        // 1. 按照层级拼接前半部分的缩进字符串
        StringBuilder stringBuilder = new StringBuilder("|");
        for (int i = 0; i < level; i++) {
            stringBuilder.append("----|");
        }
        // 2. 拼接dir本身
        stringBuilder.append(dir.getName());
        // 3. 输出结果
        System.out.println(stringBuilder.toString());
        // 4. 判断当前的dir是否是一个文件夹，如果是一个文件夹，递归输出这个文件夹中的所有的内容
        if (dir.isDirectory()) {
            // 4.1. 获取所有的子文件
            File[] files = dir.listFiles();
            // 4.2. 遍历所有的子文件，进行内容展示
            for (File file : files) {
                showDir(file, level + 1);
            }
        }
    }
}
