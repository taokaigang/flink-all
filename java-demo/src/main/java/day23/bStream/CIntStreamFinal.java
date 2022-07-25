package day23.bStream;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/22
 * @Description IntStream的其他的最终操作
 */
public class CIntStreamFinal {
    public static void main(String[] args) {
        // 1. 实例化一个int[]，作为数据源
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // 2. 获取到一个IntStream
        IntStream stream = Arrays.stream(array);

        // int max = stream.max().getAsInt();                   // 获取最大值
        // int min = stream.min().getAsInt();                   // 获取最小值
        // int sum = stream.sum();                              // 获取流中所有的数据的和
        // long count = stream.count();                         // 获取流中有多少数据
        // double asDouble = stream.average().getAsDouble();    // 计算流中所有的数据的平均值

        // 获取对流中数据的统计分析结果，包含了(最大值、最小值、和、平均值、数量)
        IntSummaryStatistics intSummaryStatistics = stream.summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());      // 获取最大值
        System.out.println(intSummaryStatistics.getMin());      // 获取最小值
        System.out.println(intSummaryStatistics.getSum());      // 获取和
        System.out.println(intSummaryStatistics.getAverage());  // 获取平均值
        System.out.println(intSummaryStatistics.getCount());    // 获取数量
    }
}
