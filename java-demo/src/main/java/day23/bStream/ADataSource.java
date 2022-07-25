package day23.bStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description 将数据源中的数据读取到流中
 */
public class ADataSource {
    public static void main(String[] args) {
        // 1. 准备一个数组，作为数据源
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // 2. 将数组作为数据源，把数据读取到流中
        Stream<Integer> stream = Arrays.stream(array);

        int[] array1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // 截取数组中的一部分数据，读取到流中
        IntStream stream1 = Arrays.stream(array1, 3, 8);
    }

    /**
     * 将Collection作为数据源
     */
    private static void collectionDataSource() {
        // 1. 准备一个Collection集合作为数据源
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        // 2. 将Collection集合作为数据源, 数据读取到流中
        //    这种方法获取到的流，是一个串行流。暂时可以不用考虑什么串行、并行。
        Stream<Integer> stream1 = collection.stream();
        // 3. 将Collection集合作为数据源, 数据读取到流中
        //    这种方法获取到的流，是一个并行流。暂时可以不用考虑什么串行、并行。
        Stream<Integer> stream2 = collection.parallelStream();
    }
}
