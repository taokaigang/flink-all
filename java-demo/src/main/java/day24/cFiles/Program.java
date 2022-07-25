package day24.cFiles;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/23
 * @Description File类的构造方法
 */
public class Program {
    public static void main(String[] args) {
        // 1. File(String pathname)
        //   如果这个路径下的文件不存在，不影响File对象的实例化。
        File file = new File("C:\\Users\\luds\\Desktop\\dis_hash.png");
        System.out.println(file.exists());

        // 2. File(String parent, String child)
        //    在这个构造方法中，会将parent与child合并在一起
        File file1 = new File("C:\\Users\\luds\\Desktop", "dis_hash.png");
        System.out.println(file1);
        System.out.println(file1.exists());

        // 3. File(File parent, String child)
        //    在构造方法中，将parent的路径和child进行拼接，得到一个新的路径
        File desktop = new File("C:\\Users\\luds\\Desktop");
        File file2 = new File(desktop, "dis_hash.png");
        System.out.println(file2);
        System.out.println(file2.exists());
    }
}
