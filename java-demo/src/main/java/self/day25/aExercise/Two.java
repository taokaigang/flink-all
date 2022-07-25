package self.day25.aExercise;

import java.io.*;

public class Two {
    /**
     * 2. 【难】设计一个方法，实现一个文件夹的拷贝（包括文件夹中的子文件和子文件夹）
     * @param args
     */
    public static void main(String[] args) {
        String oldPath = "C:\\Users\\tao2720\\Desktop\\千锋大数据作业";
        String newPath = "C:\\Users\\tao2720\\Desktop\\千锋大数据";
        File dirNew = new File(newPath);
        dirNew.mkdirs();//可以在不存在的目录中创建文件夹
        directory(oldPath, newPath);
    }
    /**
     * 复制单个文件
     * @param oldPath 要复制的文件名
     * @param newPath 目标文件名
     */
    public static void copyFile(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        if (oldFile.exists()) {
            // 2. 实现文件的拷贝
            try (Reader reader=new FileReader(oldPath);
                 Writer writer = new FileWriter(newPath)){
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param oldPath 要复制的文件夹路径
     * @param newPath 目标文件夹路径
     */
    public static void directory(String oldPath, String newPath) {
        File f1 = new File(oldPath);
        File[] files = f1.listFiles();//listFiles能够获取当前文件夹下的所有文件和文件夹
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                File dirNew = new File(newPath + "\\" + files[i].getName());
                dirNew.mkdir();//在目标文件夹中创建文件夹
                //递归
                directory(oldPath + "\\" + files[i].getName(), newPath + "\\" + files[i].getName());
            } else {
                String filePath = newPath + "\\" + files[i].getName();
                copyFile(files[i].getAbsolutePath(), filePath);
            }

        }
    }
}
