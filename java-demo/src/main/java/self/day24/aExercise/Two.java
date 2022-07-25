package self.day24.aExercise;

import java.io.File;

public class Two {
    /**
     * 2. 【简】在桌面上创建一个30层的文件夹
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("C:\\Users\\tao2720\\Desktop\\");
        String[] names = { "富强", "民主", "文明", "和谐", "自由", "平等", "公正", "法制", "爱国", "敬业", "诚信", "友善" };
        for (int i = 0; i < 30; i++) {
            stringBuilder.append(names[i % names.length]).append("\\");
        }
        System.out.println(new File(stringBuilder.toString()).mkdirs());
    }
}
