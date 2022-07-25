package day18.bStringOperator;


/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description String、StringBuffer、StringBuilder 拼接效率比较
 */
public class Test2 {
    public static void main(String[] args) {
        // 需求: 进行字符串的拼接 100000 次。

        String str = "";
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        int times = 100000;

        // String类的拼接
        long time0 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            str += i;
        }
        long time1 = System.currentTimeMillis();

        // StringBuffer的拼接
        for (int i = 0; i < times; i++) {
            buffer.append(i);
        }
        long time2 = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            builder.append(i);
        }
        long time3 = System.currentTimeMillis();

        System.out.println("String: " + (time1 - time0));
        System.out.println("StringBuffer: " + (time2 - time1));
        System.out.println("StringBuilder: " + (time3 - time2));
    }
}
