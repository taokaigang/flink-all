//package com.tkg;
//import org.apache.flink.table.api.*;
//
//import static org.apache.flink.table.api.Expressions.*;
//
//
//public class Demo04 {
//    public static void main(String[] args) {
//
//
//        EnvironmentSettings settings = EnvironmentSettings
//                .newInstance()
//                .inStreamingMode()
//                .build();
//
//        TableEnvironment tEnv = TableEnvironment.create(settings);
//
//// 在表环境中注册 Orders 表
//// ...
//
//// 指定表程序
//        Table orders = tEnv.from("Orders"); // schema (a, b, c, rowtime)
//
//        Table counts = orders
//                .groupBy($("a"))
//                .select($("a"), $("b").count().as("cnt"));
//
//// 打印
//        counts.execute().print();
//    }
//}
