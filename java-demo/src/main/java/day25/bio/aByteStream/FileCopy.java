package day25.bio.aByteStream;

import java.io.*;

/**
 * @Description 使用字节流实现文件的拷贝
 */
public class FileCopy {
    public static void main(String[] args) {
        boolean ret = copy("C:\\Users\\luds\\Desktop\\src.mp4", "C:\\Users\\luds\\Desktop\\dst.mp4");
        System.out.println(ret);
    }

    /**
     * 实现功能: 将源文件中的数据拷贝到目标文件
     * @param srcPath 原文件路径
     * @param dstPath 目标文件路径
     * @return 拷贝的结果
     */
    private static boolean copy(String srcPath, String dstPath) {
        // 1. 判断目标路径上，是否有文件存在
        File dst = new File(dstPath);
        if (dst.exists()) {
            return false;
        }
        // 2. 实现文件的拷贝
        try (InputStream inputStream = new FileInputStream(srcPath);
             OutputStream outputStream = new FileOutputStream(dst)) {
            // 拷贝的过程
            // 2.1. 实例化一个字节数组
            byte[] array = new byte[1024];
            // 2.2. 声明一个整型变量，用来记录每次读取到了多少个字节的数据
            int length = 0;
            // 2.3. 循环读取数据
            while ((length = inputStream.read(array)) != -1) {
                // 2.4. 将读取到的数据，写入到输出流中
                outputStream.write(array, 0, length);
            }
            // 2.5. 冲刷缓冲区
            outputStream.flush();
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
