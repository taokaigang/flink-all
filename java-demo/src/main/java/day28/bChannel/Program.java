package day28.bChannel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/28
 * @Description
 */
public class Program {

    public static void main(String[] args) {
        // method1();
        // method2();
        method3();
    }

    /**
     * 使用支持通道的类获取通道
     */
    private static void method1() {
        // 实例化两个流，分别连接两个文件
        try (FileInputStream inputStream = new FileInputStream("file\\day28\\src\\src");
             FileOutputStream outputStream = new FileOutputStream("file\\day28\\src\\dst")) {
            // 1. 通过流，打开通道
            FileChannel srcChannel = inputStream.getChannel();
            FileChannel dstChannel = outputStream.getChannel();
            // 2. 开辟缓冲区，读写数据
            ByteBuffer buffer = ByteBuffer.allocate(512);
            // 3. 循环读写缓冲区
            //    read(Buffer buffer)
            //    意义：将文件中的数据写到缓冲区中
            //    返回值：本次写了多少数据，如果是-1代表没有数据了
            while (srcChannel.read(buffer) != -1) {
                // 将缓冲区切换到“读模式”
                buffer.flip();
                // 将缓冲区中的数据读取出来，写入到目标文件中
                dstChannel.write(buffer);
                // 将缓冲区重置，方便下次从原文件中读取数据
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用FileChannel.open方法打开通道
     * Path: 这是一个用来描述一个文件路径的类，通常情况下，可以直接使用 Paths.get() 方法获取路径对象
     * OpenOption: 打开一个文件的方式，通常情况下，使用 StandardOpenOption 枚举获取结果
     * StandardOpenOption:
     *      READ            : 读取文件
     *      WRITE           : 写文件
     *      APPEND          : 会在末尾追加
     *      CREATE          : 如果不存在这个文件，则进行创建；如果存在这个文件，则不作任何事情
     *      CREATE_NEW      : 如果不存在这个文件，则进行创建；如果存在这个文件，则抛异常
     */
    private static void method2() {

        try {
            FileChannel srcChannel = FileChannel.open(Paths.get("file\\day28\\src\\src"), StandardOpenOption.READ);
            FileChannel dstChannel = FileChannel.open(Paths.get("file\\day28\\src\\dst"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

            ByteBuffer buffer = ByteBuffer.allocate(128);
            while ((srcChannel.read(buffer)) != -1) {
                buffer.flip();
                dstChannel.write(buffer);
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用Files工具类中的方法
     */
    private static void method3() {
        try {
            FileChannel srcChannel = (FileChannel)Files.newByteChannel(Paths.get("file\\day28\\src\\src"), StandardOpenOption.READ);
            FileChannel dstChannel = (FileChannel)Files.newByteChannel(Paths.get("file\\day28\\src\\dst"), StandardOpenOption.WRITE, StandardOpenOption.APPEND, StandardOpenOption.CREATE);

            ByteBuffer buffer = ByteBuffer.allocate(128);
            while ((srcChannel.read(buffer)) != -1) {
                buffer.flip();
                dstChannel.write(buffer);
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
