package day27.nio;

import java.nio.ByteBuffer;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/27
 * @Description
 */
public class BufferTest2 {
    public static void main(String[] args) {
        // 1. 开辟缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put("hello".getBytes());
        buffer.flip();      // limit: 5, position: 0

        // 2. 读取数据
        byte[] array = new byte[2];
        buffer.get(array);  // limit: 5, position: 2
        System.out.println(new String(array));  // he
        // 3. 添加一个mark, 将属性mark的值，设置为当前的position的值
        buffer.mark();      // position: 2, mark: 2

        buffer.get(array);  // limit: 5, position: 4
        System.out.println(new String(array));  // ll
        // 4. 重置，将position的值，修改为mark的值
        buffer.reset();     // mark: 2, position: 2

        buffer.get(array);  // limit: 5, position: 4
        System.out.println(new String(array));  // ll

        // 5. 倒回，将position的值重置为0，同时清空mark
        buffer.rewind();
        buffer.get(array);  // limit: 5, position: 2
        System.out.println(new String(array));  // he

        // 6. 清空, 将所有的属性值重置
        //    limit: capacity, position: 0, mark: -1
        //    现在，就可以继续向缓冲区中写数据了
        buffer.clear();
    }
}
