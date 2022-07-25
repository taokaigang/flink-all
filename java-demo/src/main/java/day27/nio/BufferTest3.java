package day27.nio;

import java.nio.ByteBuffer;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/27
 * @Description “读模式”与“写模式”误区
 */
public class BufferTest3 {
    public static void main(String[] args) {
        // 1. 开辟一个缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(10);
        // 2. 添加数据
        buffer.put("hello".getBytes());
        // 3. “切换到读模式”
        buffer.flip();
        // 4. 继续写数据
        buffer.put("wor".getBytes());
        // 5. 将position重置为0
        buffer.rewind();
        // 6. 从缓冲区中读取数据
        byte[] arr = new byte[buffer.limit()];
        buffer.get(arr);
        System.out.println(new String(arr));        // worlo
        // 7. 清空缓冲区，“切换到写模式”
        buffer.clear();
        // 8. 读取数据
        byte[] arr1 = new byte[7];
        buffer.get(arr1);
        System.out.println(new String(arr1));

        buffer.isDirect();
    }
}

