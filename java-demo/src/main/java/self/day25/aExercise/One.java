package self.day25.aExercise;

import java.io.*;

public class One {
    /**
     * 1. 【简】设计两个方法，分别实现拷贝一个文本文件（分别用字节流和字符流实现）
     * @param args
     */
    public static void main(String[] args) {
        boolean ret = copy("C:\\Users\\tao2720\\Desktop\\src.mp4", "C:\\Users\\tao2720\\Desktop\\dst.mp4");
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

    private static boolean copy2(String srcPath, String dstPath){
        // 1. 判断目标路径上，是否有文件存在
        File dst = new File(dstPath);
        if (dst.exists()) {
            return false;
        }
        // 2. 实现文件的拷贝
        try (Reader reader=new FileReader(srcPath);
             Writer writer = new FileWriter(dstPath)){
            // 1. 实例化一个字符数组
            char[] array = new char[1024];
            // 2. 声明一个变量，用来记录每次读取到了多少个数据
            int length = 0;
            // 3. 循环读取数据
            while ((length = reader.read(array)) != -1) {
                String str = new String(array, 0, length);
                System.out.print(str);
            }
            // 2.5. 冲刷缓冲区
            writer.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }
}
