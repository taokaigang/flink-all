package com.flink.batch;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 创建执行环境
        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        DataSource<String> textFile = env.readTextFile("src/main/resources/wc.txt");
        // 对数据集进行处理，按空格分词展开，转换成(word, 1)二元组进行统计
        // 按照第一个位置的word分组
        // 按照第二个位置上的数据求和
        DataSet<Tuple2<String, Integer>> flatMapDataSet = textFile.flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {
            @Override
            public void flatMap(String data, Collector<Tuple2<String, Integer>> collector) throws Exception {
                for (String word : data.split(" ")) {
                    collector.collect(Tuple2.of(word, 1));
                }
            }
        });
        flatMapDataSet.groupBy(0).sum(1).print();


    }

}