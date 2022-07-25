package day23.bStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description 最终操作
 */
public class BFinalOperation {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 );
        // 将数据读取到数据源中
        Stream<Integer> stream = collection.stream();

        // 1. 最终操作collect
        // collect(stream);

        // 2. 最终操作reduce
        // reduce(stream);

        // 3. 最终操作count
        // count(stream);

        // 4. 遍历流中的数据
        // forEach(stream);

        // 5. 获取最大值&最小值
        // maxAndMin(stream);

        // 6. 匹配
        // matching(stream);

        // 7. 元素查找
        // find();

    }

    /**
     * 最终操作collect
     * @param stream 流对象
     */
    private static void collect(Stream<Integer> stream) {
        // 数据收集、聚合，将数据聚合到一个集合中
        // List<Integer> list = stream.collect(Collectors.toList());
        // Set<Integer> collect = stream.collect(Collectors.toSet());
        // 转成Map是一个比较复杂的方法，需要两个Function作为参数，分别做当前流中的元素映射成键的规则和映射成值的规则
        // Map<String, String> collect = stream.collect(Collectors.toMap(e -> "key" + e, e -> "value" + e));
    }

    /**
     * 最终操作reduce
     * @param stream 操作的流
     */
    private static void reduce(Stream<Integer> stream) {
        // 需求：计算一个集合中所有的数据的和
        Optional<Integer> reduce = stream.reduce(Integer::sum);
        // reduce方法得到的结果是Optional，表示可空数据。如果要获取实际的数据，需要用get方法获取。
        Integer sum = reduce.get();
        System.out.println(sum);
    }

    /**
     * 最终操作count
     * @param stream 操作的流
     */
    private static void count(Stream<Integer> stream) {
        // 统计流中有多少数据
        long count = stream.count();
        System.out.println(count);
    }

    /**
     * 最终操作forEach
     * @param stream 操作的流
     */
    private static void forEach(Stream<Integer> stream) {
        // 迭代、遍历。将流中的数据依次带入到参数接口的方法中，作为参数。
        stream.forEach(System.out::println);
    }

    /**
     * 最终操作 max & min
     * @param stream 操作的流
     */
    private static void maxAndMin(Stream<Integer> stream) {
        // Integer max = stream.max(Integer::compareTo).get();
        // System.out.println(max);
        Integer min = stream.min(Integer::compareTo).get();
        System.out.println(min);
    }

    /**
     * 最终操作Matching
     * @param stream 需要操作的流
     */
    private static void matching(Stream<Integer> stream) {
        // 验证，是否流中所有的数据都满足指定条件
        // boolean ret = stream.allMatch(ele -> ele > 0);
        // System.out.println(ret);

        // 验证，是否流中有满足条件的数据
        // boolean ret = stream.anyMatch(ele -> ele > 5);
        // System.out.println(ret);

        // 验证，是否流中所有的数据都不满足指定的条件
        boolean ret = stream.noneMatch(ele -> ele > 15);
        System.out.println(ret);
    }

    /**
     * 最终操作find
     */
    private static void find() {
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        // 1. findFirst
        System.out.println(collection.stream().findFirst().get());
        System.out.println(collection.parallelStream().findFirst().get());
        // 2. findAny
        System.out.println(collection.stream().findAny().get());
        System.out.println(collection.parallelStream().findAny().get());
    }
}
