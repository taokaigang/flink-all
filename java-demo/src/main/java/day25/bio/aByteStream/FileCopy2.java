package day25.bio.aByteStream;

import java.io.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/24
 * @Description 恶趣味的拷贝
 */
public class FileCopy2 {

    private static byte key = 123;

    public static void main(String[] args) {
        lock("C:\\Users\\luds\\Desktop\\src.mp4");
    }

    private static void lockDir(String dir) {
        File file = new File(dir);
        File[] files = file.listFiles(f -> f.getName().matches(".*\\.(mp4|rmvb|avi)"));
        for (File file1 : files) {
            lock(file1.getAbsolutePath());
        }
    }
    /**
     * 将某一个文件“上锁”
     * @param filePath 文件的路径
     */
    private static void lock(String filePath) {
        // 1. 当前目录下，拷贝出当前文件的副本
        File src = new File(filePath);
        File dst = new File(src.getParent(), src.getName() + ".bak");
        try (InputStream inputStream = new FileInputStream(src);
             OutputStream outputStream = new FileOutputStream(dst)) {
            // 1.1. 实例化数组
            byte[] array = new byte[1024];
            // 1.2. 声明一个变量，用来记录拷贝的字节数量
            int length = 0;
            // 1.3. 循环拷贝
            while ((length = inputStream.read(array)) != -1) {
                // 1.4. 所谓“加密”
                lockArray(array);
                // 1.5. 将输入写入到输出流
                outputStream.write(array, 0, length);
            }
            outputStream.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // 2. 删除源文件
        src.delete();
        // 3. 将目标文件重命名为源文件的名字
        dst.renameTo(src);
    }

    private static void lockArray(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] ^= key;
        }
    }
}
