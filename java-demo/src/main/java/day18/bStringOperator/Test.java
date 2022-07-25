package day18.bStringOperator;


/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 构造方法
        StringBuilder sb = new StringBuilder("hello world");

        // 2. 增: 在一个字符串后面拼接其他的字符串
        sb.append('!');

        // 3. 增: 在指定的下标位插入一条数据
        sb.insert(3, "AAAAA");

        // 4. 删: 删除字符串中的 [start, end) 范围内的数据
        sb.delete(3, 5);

        // 5. 删: 删除指定位的字符
        sb.deleteCharAt(6);

        // 6. 截取一部分的字符串，这个操作不会修改到自己，如果希望得到截取的部分，需要接收返回值。
        String sub = sb.substring(4, 6);

        // 7. 替换，将字符串中 [start, end) 范围内的数据替换成指定的字符串
        sb.replace(3, 6, "l");

        // 8. 修改指定下标位的字符
        sb.setCharAt(0, 'H');

        // 9. 将字符串前后翻转
        sb.reverse();

        System.out.println(sb);
    }
}
