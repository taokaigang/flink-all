package day27.nio;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/**
 * @Description
 */
public class BufferTest {
    public static void main(String[] args) {
        // 1. 开辟一个缓冲区，参数是 capacity
        ByteBuffer buffer = ByteBuffer.allocate(10);
        showBuffer(buffer, "allocate");

        // 2. 向缓冲区中写数据
        buffer.put((byte)97);                   // put一个字节
        showBuffer(buffer, "put一个字节");
        buffer.put("hello".getBytes());         // put一个字节数组
        showBuffer(buffer, "put一个字节数组");
        try {
            // 如果put的数据超出了缓冲区的大小，导致 position > limit
            // 此时会出现异常，且本次的数组并没有存入缓冲区
            buffer.put("world".getBytes());
        }
        catch (BufferOverflowException e) {
            System.out.println("超出存储空间");
        }
        showBuffer(buffer, "put越界");

        // 3. 切换读模式
        buffer.flip();
        showBuffer(buffer, "flip");

        // 4. 读取数据
        byte n = buffer.get();
        System.out.println(n);
        showBuffer(buffer, "get了一个字节");

        // 4.1. 实例化一个数组，用来读取多个数据
        byte[] arr = new byte[3];
        buffer.get(arr);    // 将缓冲区中的数据，读取到了数组中
        System.out.println(new String(arr));
        showBuffer(buffer, "get了3个字节");

        buffer.get(arr);
        System.out.println(new String(arr));
        showBuffer(buffer, "又读了3个字节");


    }

    /**
     * 展示缓冲区中的常用属性值
     * @param buffer 需要展示的缓冲区
     * @param msg 需要进行的操作
     */
    private static void showBuffer(ByteBuffer buffer, String msg) {
        System.out.println("---------" + msg + "---------");
        System.out.println("capacity = " + buffer.capacity());
        System.out.println("limit = " + buffer.limit());
        System.out.println("position = " + buffer.position());
    }
}
