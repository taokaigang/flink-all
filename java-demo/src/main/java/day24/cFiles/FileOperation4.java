package day24.cFiles;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/23
 * @Description 获取某一个目录下的所有的内容
 */
public class FileOperation4 {
    public static void main(String[] args) {
        // 实例化一个File对象
        File file = new File("C:\\Users\\tao2720\\Desktop");
        // 1. 列举一个目录下所有的子文件的名字
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 2. 列举一个目录下所有的子文件的名字
        //    带有过滤信息的。
        String[] names1 = file.list((f, name) -> {
            // f: 父级文件夹的File对象
            // name: 子文件的名字
            // 返回值: 如果是true，将会在结果的数组中展示
            return name.startsWith(".");
        });
        for (String s : names1) {
            System.out.println(s);
        }

        // 3. 列举一个目录下所有的子文件(以File对象的方式)
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

        // 4. 列举一个目录下所有的满足指定条件的子文件
        File[] files1 = file.listFiles(File::isHidden);
        for (File file1 : files1) {
            System.out.println(file1);
        }

        // 5. 举一个目录下所有的满足指定条件的子文件
        File[] files2 = file.listFiles((f, n) -> new File(f, n).isHidden());

    }
}
