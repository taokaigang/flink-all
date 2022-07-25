package day25.aExercise.three;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个File对象，用来描述桌面
        File desktop = new File("C:\\Users\\luds\\Desktop");
        // 2. 获取桌面上所有的非隐藏的文件
        File[] files = desktop.listFiles(f -> !f.isHidden() && f.isFile());

        for (File file : files) {
            System.out.println(file);
        }
    }
}
