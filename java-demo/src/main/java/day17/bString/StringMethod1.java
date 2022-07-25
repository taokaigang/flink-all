package day17.bString;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description 字符串的构造方法
 */
public class StringMethod1 {
    public static void main(String[] args) {
        // 1. 无参构造， 实例化一个空的字符串对象。 所谓的空字符串，其实是 "", 并不是null。
        String s1 = new String();   // String s1 = "";
        System.out.println(s1);

        // 2. 通过一个字符串， 实例化另外一个字符串。
        String s2 = new String("hello");
        System.out.println(s2);

        char[] arr1 = { 'h', 'e', 'l', 'l', 'o' };
        // 3. 通过一个字符数组， 实例化一个字符串。将字符数组中的所有的字符拼接到一起。
        String s3 = new String(arr1);
        System.out.println(s3);
        // 4. 通过一个字符数组， 实例化一个字符串。 将字符数组中的指定范围的字符拼接到一起。
        String s4 = new String(arr1, 2, 3);
        System.out.println(s4);

        byte[] arr2 = { 97, 98, 99, 100, 101, 102, 103, 104 };
        // 5. 将一个字节数组中的每一个字节，转成对应的字符，再拼接到一起，组成一个字符串。
        String s5 = new String(arr2);
        System.out.println(s5);
        // 6. 将一个字节数组中的offset位开始，取length个字节，将每一个字节，转成对应的字符，再拼接到一起，组成一个字符串。
        String s6 = new String(arr2, 2, 4);
        System.out.println(s6);
    }
}
