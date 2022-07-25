package self.day24.aExercise;

import java.io.File;

public class Four {
    /**
     * 4. 【中】递归删除一个非空的文件夹
     * @param args
     */
    public static void main(String[] args) {
        File file=new File("D:\\富强");


    }

    private static void delDirectory(File file){
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] files = file.listFiles();
                    if (files.length > 0) {
                        for (int i = 0; i < files.length; i++) {
                            delDirectory(files[i]);//先删除文件夹下的所有文件
                        }
                    }
                }
                else {
                    file.delete();
                }
            }

    }
}
