package day26.aExercise.two;

import java.io.*;

/**
 * @Description 设计一个方法，实现一个文件夹的拷贝（包括文件夹中的子文件和子文件夹）
 *
 *      思路: 这里，一定要用到递归的思想。
 *      1. 设计一个方法，用来做拷贝一个文件夹中的所有的子文件。
 *      2. 如果存在子文件夹，则递归调用当前的这个方法。
 */
public class Test {

    public static void main(String[] args) {
        copyDir(new File("C:\\Users\\luds\\Desktop\\NZ2002文档"), new File("C:\\Users\\luds\\Desktop\\NZ2002文档-副本"));
    }

    /**
     * 文件夹拷贝
     * @param src 源文件夹
     * @param dst 目标文件夹
     */
    private static void copyDir(File src, File dst) {
        // 1. 先在目标位置创建文件夹
        dst.mkdirs();
        // 2. 获取原文件夹下所有的子文件
        File[] files = src.listFiles();
        // 3. 遍历每一个子文件，进行文件的拷贝
        for (File file : files) {
            if (file.isDirectory()) {
                // 递归调用自己，进行文件夹的拷贝
                copyDir(file, new File(dst, file.getName()));
            }
            else {
                // 文件的拷贝
                copyFile(file, new File(dst, file.getName()));
            }
        }
    }

    /**
     * 拷贝文件
     * @param srcPath 源文件路径
     * @param dstPath 目标文件路径
     */
    private static void copyFile(File srcPath, File dstPath) {
        // 1. 文件的拷贝
        try (InputStream inputStream = new FileInputStream(srcPath);
             OutputStream outputStream = new FileOutputStream(dstPath)) {
            // 2. 实例化一个字节数组
            byte[] array = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(array)) != -1) {
                // 3. 将读取到的数组，写入到输出流中
                outputStream.write(array, 0, length);
            }
            outputStream.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
