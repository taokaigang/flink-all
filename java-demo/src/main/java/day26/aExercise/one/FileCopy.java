package day26.aExercise.one;

import java.io.*;

/**
 * @Description 设计两个方法，分别实现拷贝一个文本文件（分别用字节流和字符流实现）
 */
public class FileCopy {

    public static void main(String[] args) {
        fileCopy("file\\day25\\source", "file\\day26\\source");
        fileCopy2("file\\day25\\src", "file\\day26\\src");
    }

    /**
     * 使用字节流实现文件的拷贝
     * @param srcPath 原文件路径
     * @param dstPath 目标文件路径
     * @return 拷贝是否成功
     */
    private static boolean fileCopy(String srcPath, String dstPath) {
        // 1. 判断目标路径下是否有存在的文件、目录
        if (checkExists(dstPath)) {
            return false;
        }
        // 2. 文件的拷贝
        try (InputStream inputStream = new FileInputStream(srcPath);
             OutputStream outputStream = new FileOutputStream(dstPath)) {
            // 3. 实例化一个字节数组
            byte[] array = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(array)) != -1) {
                // 4. 将读取到的数组，写入到输出流中
                outputStream.write(array, 0, length);
            }
            outputStream.flush();
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 使用字符流实现文件的拷贝
     * @param srcPath 原文件路径
     * @param dstPath 目标文件路径
     * @return 拷贝的结果
     */
    private static boolean fileCopy2(String srcPath, String dstPath) {
        // 1. 判断目标文件是否存在
        if (checkExists(dstPath)) {
            return false;
        }
        // 2. 循环读取目标文件中的数据
        try (Reader reader = new FileReader(srcPath); Writer writer = new FileWriter(dstPath)) {
            // 3. 循环读取源文件中的数据
            char[] array = new char[100];
            int length = 0;
            while ((length = reader.read(array)) != -1) {
                // 4. 将读取到的数据写入到输出流
                writer.write(array, 0, length);
            }
            writer.flush();
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean checkExists(String path) {
        return new File(path).exists();
    }
}
