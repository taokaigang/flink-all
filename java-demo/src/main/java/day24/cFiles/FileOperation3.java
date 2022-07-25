package day24.cFiles;

import java.io.File;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/23
 * @Description
 */
public class FileOperation3 {
    public static void main(String[] args) {
        // 创建一个1000层的文件夹
        StringBuilder stringBuilder = new StringBuilder("C:\\Users\\luds\\Desktop\\");
        String[] names = { "富强", "民主", "文明", "和谐", "自由", "平等", "公正", "法制", "爱国", "敬业", "诚信", "友善" };
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(names[i % names.length]).append("\\");
        }
        // System.out.println(new File(stringBuilder.toString()).mkdirs());

        // 将一个文件挪到1000层文件夹中
        // File src = new File("C:\\Users\\luds\\Desktop\\dis_hash.png");
        // File dst = new File(stringBuilder.append("dis_hash.png").toString());
        // System.out.println(src.renameTo(dst));

        //
        File src = new File(stringBuilder.append("dis_hash.png").toString());
        File dst = new File("C:\\Users\\luds\\Desktop\\dis_hash.png");
        System.out.println(src.renameTo(dst));
    }
}
