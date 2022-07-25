package self.day24.aExercise.one;

import java.io.File;

public class One {
    /**
     * 1. 【难】设计一个方法，计算一个文件夹的总大小（由所有的子文件、子文件夹中的子文件夹大小组成）
     * @param args
     */
    public static void main(String[] args) {
        File file=new File("C:\\Users\\tao2720\\Desktop\\千锋大数据作业");
        long sumSize=getSize(file);
        System.out.println(sumSize+"字节");

    }
    /**
     * 计算文件或者文件夹的大小
     * @param file 要计算的文件或者文件夹
     * @return 大小
     */
    public static long getSize(File file) {
        //判断文件是否存在
        if (file.exists()) {
            //如果是目录则递归计算其内容的总大小，如果是文件则直接返回其大小
            if (! file.isFile()) {
                //获取文件大小
                File[] f = file.listFiles();
                long sum = 0;
                //计算和
                for (File f0 : f) {
                    sum += getSize(f0);
                }
                return sum;
            } else {
                long sum = file.length();
                //System.out.println(file.getName() + " : " + sum);
                return sum;
            }
        } else {
            System.out.println("文件或者文件夹不存在，请检查路径是否正确！");
            return 0;
        }
    }
}
