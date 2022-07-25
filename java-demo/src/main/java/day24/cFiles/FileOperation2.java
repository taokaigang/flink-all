package day24.cFiles;

import java.io.File;
import java.io.IOException;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/23
 * @Description 文件的操作
 */
public class FileOperation2 {
    public static void main(String[] args) {
        // 实例化一个File对象
        File file = new File("C:\\Users\\luds\\Desktop\\abc\\a\\b\\c");

        // try {
        //     // 1. 创建文件
        //     boolean flag = file.createNewFile();
        //     System.out.println(flag);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 2. 创建文件夹(只能创建一级文件夹)
        // boolean flag = file.mkdir();
        // System.out.println(flag);

        // 3. 创建文件夹(创建多级文件夹)
        // boolean flag = file.mkdirs();
        // System.out.println(flag);

        // 4. 删除文件(目录)(可以删除文件，也可以删除空文件夹)
        //    谨慎使用: 这个方法，可以将文件直接从磁盘删除，不经过回收站。没有撤销的余地。
        // boolean flag = file.delete();
        // System.out.println(flag);

        // 5. 文件的重命名
        File src = new File("C:\\Users\\luds\\Desktop\\abc");
        File dst = new File("C:\\Users\\luds\\Desktop\\ABC");
        System.out.println(src.renameTo(dst));
        // 5.1. 借助重命名，实现文件的移动
        File src1 = new File("C:\\Users\\luds\\Desktop\\DIS_HASH.png");
        File dst1 = new File("C:\\Users\\luds\\Desktop\\ABC\\dis_hash.png");
        System.out.println(src1.renameTo(dst1));
    }
}
