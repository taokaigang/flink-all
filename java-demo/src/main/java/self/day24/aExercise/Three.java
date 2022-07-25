package self.day24.aExercise;

import java.io.File;

public class Three {
    /**
     * 3. 【中】获取桌面上所有的非隐藏的文件（不要文件夹）
     * @param args
     */
    public static void main(String[] args) {
        File file=new File("C:\\Users\\tao2720\\Desktop");
        File[] files = file.listFiles(
                f->! f.isHidden() && !f.isDirectory()
        );
        for (File file1 : files) {
            System.out.println(file1);
        }

    }
}
