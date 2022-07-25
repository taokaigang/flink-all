package day25.aExercise.two;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 实例化一个对象，用来拼接路径
        StringBuilder path = new StringBuilder("C:\\Users\\luds\\Desktop\\");
        // 列举出所有的路径的名字
        String[] names = { "a", "b", "c", "d", "e" };
        // 循环拼接路径
        for (int i = 0; i < 30; i++) {
            path.append(names[i % names.length]).append("\\");
        }
        // 创建多级文件夹
        System.out.println(new File(path.toString()).mkdirs());
    }
}
