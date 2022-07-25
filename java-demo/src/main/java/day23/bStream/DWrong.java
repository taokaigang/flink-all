package day23.bStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description
 */
public class DWrong {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        // 获取流
        Stream<Integer> stream = collection.stream();
        // 最终操作1
        long count = stream.count();
        // 最终操作2
        stream.forEach(System.out::println);
    }
}
