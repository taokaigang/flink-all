package day22.cMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description Map集合的遍历
 */
public class MapUsage2 {
    public static void main(String[] args) {
        // 1. 实例化一个Map集合
        Map<String, String> map = new HashMap<>();
        // 2. 添加元素
        map.put("name", "xiaobai");
        map.put("age", "11");
        map.put("height", "160cm");
        map.put("weight", "45kg");

        // 3.1. 使用keySet进行遍历
        // keyset(map);

        // 3.2. 使用forEach进行遍历
        // forEach(map);

        // 3.3. 使用entrySet进行遍历
        entrySet(map);

    }

    /**
     * 1. 使用keySet进行遍历
     * @param map 需要遍历的集合
     */
    private static void keyset(Map<String, String> map) {
        // 1. 获取存储了所有的键的集合
        Set<String> keys = map.keySet();
        // 2. 遍历这个Set集合
        for (String key : keys) {
            // 2.1. 通过键获取值
            String value = map.get(key);
            // 2.2. 展示一下键和值
            System.out.println("key = " + key + ", value = " + value);
        }
    }

    /**
     * 2. 使用forEach进行遍历
     * @param map 需要遍历的集合
     */
    private static void forEach(Map<String, String> map) {
        map.forEach((k, v) -> {
            // k: 遍历到的每一个键
            // v: 遍历到的每一个值
            System.out.println("key = " + k + ", value = " + v);
        });
    }

    /**
     * 3. 使用entrySet进行遍历
     * @param map 需要遍历的集合
     */
    private static void entrySet(Map<String, String> map) {
        // 1. 获取一个存储有所有的Entry的一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 2. 遍历Set集合
        for (Map.Entry<String, String> entry : entries) {
            // 2.1. 获取键
            String key = entry.getKey();
            // 2.2. 获取值
            String value = entry.getValue();
            // 2.3. 展示
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
