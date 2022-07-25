package day28.bChannel;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/28
 * @Description
 */
public class Program1 {
    public static void main(String[] args) {
        try (FileChannel inChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\src.mp4"), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\dst.mp4"), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE)){

            // 非直接缓冲区  62802
            copy(inChannel, outChannel);
            // 直接缓冲区  64682
            // copy1(inChannel, outChannel);
            // 内存映射文件 直接缓冲区实现的 16825
            // copy2(inChannel, outChannel);
            // 通道之间的通信 2491  1636
            // copy3(inChannel, outChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用非直接缓冲区进行拷贝
     * @param inChannel
     * @param outChannel
     */
    private static void copy(FileChannel inChannel, FileChannel outChannel) throws IOException {
        long time0 = System.currentTimeMillis();
        ByteBuffer buffer = ByteBuffer.allocate(10240);
        while ((inChannel.read(buffer)) != -1) {
            buffer.flip();
            outChannel.write(buffer);
            buffer.clear();
        }
        long time1 = System.currentTimeMillis();
        System.out.println(time1 - time0);
    }

    /**
     * 使用直接缓冲区进行拷贝
     * @param inChannel
     * @param outChannel
     */
    private static void copy1(FileChannel inChannel, FileChannel outChannel) throws IOException {
        long time0 = System.currentTimeMillis();
        ByteBuffer buffer = ByteBuffer.allocateDirect(128);
        while ((inChannel.read(buffer)) != -1) {
            buffer.flip();
            outChannel.write(buffer);
            buffer.clear();
        }
        long time1 = System.currentTimeMillis();
        System.out.println(time1 - time0);
    }

    /**
     * 使用内存映射文件
     * @param inChannel
     * @param outChannel
     * @throws IOException
     */
    private static void copy2(FileChannel inChannel, FileChannel outChannel) throws IOException {
        long time0 = System.currentTimeMillis();
        //
        MappedByteBuffer in = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer out = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());
        byte[] array = new byte[in.limit()];
        in.get(array);
        out.put(array);

        long time1 = System.currentTimeMillis();
        System.out.println(time1 - time0);
    }

    /**
     * 通道之间的通信
     * @param inChannel
     * @param outChannel
     * @throws IOException
     */
    private static void copy3(FileChannel inChannel, FileChannel outChannel) throws IOException {
        long time0 = System.currentTimeMillis();

        // inChannel.transferTo(0, inChannel.size(), outChannel);
        // outChannel.transferFrom(inChannel, 0, inChannel.size());

        long time1 = System.currentTimeMillis();
        System.out.println(time1 - time0);
    }
}
