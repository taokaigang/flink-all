package day12.eMutableArray;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个对象
        MutableArray array = new MutableArray();
        // 2. 添加数据
        array.add("hello");
        array.add("world");
        array.add("xiaoming");
        array.add("lily");

        array.add(4, "tom");

        array.remove(2);
        array.remove("lily");

        // array.clear();

        array.indexOf("tom");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
