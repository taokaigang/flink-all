package day24.cFiles;

import java.io.File;
import java.util.Date;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/23
 * @Description File类中的常用的方法
 */
public class FileOperation {
    public static void main(String[] args) {
        // 实例化一个对象
        File file = new File("src\\day24\\cFiles\\FileOperation.java");

        // 1. 判断一个File对象指向的路径上是否有文件或者文件夹
        System.out.println("exists = " + file.exists());
        // 2. 判断一个File对象指向的路径上是否是一个文件
        System.out.println("isFile = " + file.isFile());
        // 3. 判断一个File对象指向的路径上是否是一个目录
        System.out.println("isDir = " + file.isDirectory());
        // 4. 获取一个文件的大小（注：只能获取文件的大小，不能获取文件夹的大小）
        System.out.println("length = " + file.length());
        // 5. 判断一个文件（目录）是否是隐藏的
        System.out.println("hidden = " + file.isHidden());
        // 6. 判断文件（目录）的权限
        System.out.println("read = " + file.canRead());         // 可读权限
        System.out.println("write = " + file.canWrite());       // 可写权限
        System.out.println("execute = " + file.canExecute());   // 可执行权限
        // 7. 获取文件的名字
        System.out.println("name = " + file.getName());
        // 8. 获取文件的路径
        System.out.println("path = " + file.getPath());                 // 相对路径
        System.out.println("absolutePath = " + file.getAbsolutePath()); // 绝对路径
        // 9. 获取父级文件夹的路径(字符串)
        System.out.println("parent = " + file.getParent());
        // 10. 获取父级文件夹(File对象)
        System.out.println("parentFile = " + file.getParentFile());
        // 11. 获取文件上次修改的时间(时间戳)
        System.out.println("lastModified = " + file.lastModified());
        System.out.println(new Date(file.lastModified()));
    }
}
