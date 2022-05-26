package com.tkg.util;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import java.util.Properties;
public class MyKafkaUtil {
    private static String KAFKA_SERVER = "hadoop201:9092,hadoop202:9092,hadoop203:9092";
    private static Properties properties =  new Properties();
    static {
        properties.setProperty("bootstrap.servers",KAFKA_SERVER);
    }
    public static FlinkKafkaProducer<String> getKafkaSink(String topic){
        return new FlinkKafkaProducer<String>(topic,new SimpleStringSchema(),properties);
    }
}
