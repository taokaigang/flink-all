package day28.cFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/28
 * @Description
 */
public class FilesUsage {
    public static void main(String[] args) throws IOException {
        // 1. 创建一级文件夹(如果这个文件夹存在，会抛异常)
        // Files.createDirectory(Paths.get("C:\\Users\\luds\\Desktop\\abc"));
        // 2. 创建多级文件夹(如果需要创建的文件夹存在，不会抛出异常)
        // Files.createDirectories(Paths.get("C:\\Users\\luds\\Desktop\\abc\\a\\b\\c"));
        // 3. 创建一个文件(如果这个文件已存在，重复创建会异常)
        // Files.createFile(Paths.get("C:\\Users\\luds\\Desktop\\abc\\file"));
        // 4. 删除一个文件或者空文件夹(如果要删除的文件或空文件夹不存在，会抛异常；如果删除的不是一个空文件夹也会抛异常)
        // Files.delete(Paths.get("C:\\Users\\luds\\Desktop\\abc\\file"));
        // 5. 删除一个文件或者空文件夹(如果删除失败，不会抛异常，返回false)
        // Files.deleteIfExists(Paths.get("C:\\Users\\luds\\Desktop\\abc\\file"));
        // 6. 移动文件(重命名)
        // Files.move(Paths.get("file\\day28\\source"), Paths.get("file\\day28\\dst\\source"));

        // 7. 拷贝文件
        Files.copy(Paths.get("file\\day28\\dst\\source"), Paths.get("file\\day28\\source"));
    }
}
