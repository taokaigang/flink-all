package day20.bCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description 集合的遍历
 */
public class Test2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("lily");
        collection.add("lucy");
        collection.add("polly");
        collection.add("Jim");
        collection.add("Li Lei");
        collection.add("Han Meimei");

        // enumunation(collection);
        // enumunation2(collection);
        enumunation3(collection);
    }


    private static void enumunation3(Collection<String> collection) {
        collection.forEach(System.out::println);
    }

    private static void enumunation2(Collection<String> collection) {
        // 1. 获取到一个迭代器对象
        Iterator<String> iterator = collection.iterator();

        // 2. 通过hasNext判断是否还有下一个元素
        while (iterator.hasNext()) {
            // 3. 向后指向，并返回这个新的指向的元素
            String ele = iterator.next();
            System.out.println(ele);
        }
    }

    // 增强for循环
    private static void enumunation(Collection<String> collection) {
        for (String str : collection) {
            System.out.println(str);
            if (str.equals("Jim")) {
                collection.add("123");
            }
        }
    }
}
