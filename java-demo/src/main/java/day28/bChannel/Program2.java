package day28.bChannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/28
 * @Description
 */
public class Program2 {
    public static void main(String[] args) {
        try (FileChannel srcChannel = FileChannel.open(Paths.get("file\\day28\\src\\src"), StandardOpenOption.READ);
             FileChannel dstChannel = FileChannel.open(Paths.get("file\\day28\\src\\target"), StandardOpenOption.WRITE, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            // 做多个缓冲区，存入一个数组中
            ByteBuffer[] buffers = new ByteBuffer[4];
            for (int i = 0; i < buffers.length; i++) {
                buffers[i] = ByteBuffer.allocate(128);
            }
            while (srcChannel.read(buffers) != -1) {
                // 从源文件读取数据
                for (ByteBuffer buffer : buffers) {
                    buffer.flip();
                }
                dstChannel.write(buffers);
                for (ByteBuffer buffer : buffers) {
                    buffer.clear();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
