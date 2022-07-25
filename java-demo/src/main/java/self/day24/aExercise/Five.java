package self.day24.aExercise;

import java.io.File;

public class Five {
    /**
     * 5. 【难】列举一个文件夹中的所有的文件，及子文件夹中的子文件
     *      格式如下：
     *      | a
     *      |----|b
     *      |----|c
     *      |----|----|a.txt
     *      |----|----|b.txt
     *      |----|d
     *      |----|----|e.mp4
     *      |----|----|f
     *      |----|----|----|a.avi
     * @param args
     */
    public static void main(String[] args) {
        File file=new File("C:\\Users\\tao2720\\Desktop\\a");
        getAll(file);
    }
    private static void getAll(File file){
        if (file.exists()){
            if (file.isFile()){
                System.out.println("|" + file.getName());
            }
            else {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    System.out.print("|----");
                    getAll(file1);
                }
            }
        }
    }
}
