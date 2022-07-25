package day22.cMap;

import java.util.*;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description Map API
 */
public class MapUsage {
    public static void main(String[] args) {
        // 1. 实例化一个Map集合的实现类对象，并向上转型为接口类型。
        Map<String, String> map = new HashMap<>();

        // 2. 向集合中插入数据
        String value = map.put("name", "xiaoming");
        System.out.println(value);      // 由于第一次添加这个键值对，集合中没有被覆盖的值，因此返回null
        String value2 = map.put("name", "xiaobai");
        System.out.println(value2);     // 这里是第二次设置name的值，会用xiaobai覆盖掉xiaoming，因此返回xiaoming

        // 3. 向集合中插入数据
        String value3 = map.putIfAbsent("name", "xiaohong");
        System.out.println(value3);     // 这里返回的是集合中已经存在的这个键对应的值
        String value4 = map.putIfAbsent("age", "20");
        System.out.println(value4);     // 由于这个集合中原来是没有age键存在的，所以返回的是null

        // 4. 将一个Map集合中所有的键值对添加到当前的集合中
        Map<String, String> tmp = new HashMap<>();
        tmp.put("height", "177");
        tmp.put("weight", "65");
        tmp.put("age", "30");
        map.putAll(tmp);


        // 5. 删除：通过键，删除一个键值对，并返回这个被删除的键值对中的值。
        String value5 = map.remove("weight");
        System.out.println(value5);

        // 6. 删除
        boolean value6 = map.remove("age", "30");
        System.out.println(value6);

        // 7. 清空集合
        // map.clear();

        // 8. 修改集合中的某一个键值对（通过键，修改值）
        String value7 = map.replace("name", "xiaohei");
        System.out.println(value7);     // 返回被覆盖的值
        String value8 = map.replace("age", "30");
        System.out.println(value8);     // 由于map中没有age键，因此这个返回null

        // 9. 修改: 只有当key和oldValue是匹配的情况下，才会将值修改成newValue。
        boolean value9 = map.replace("name", "xiaohei", "xiaohong");
        System.out.println(value9);

        // 10. 对集合中的元素进行批量的替换
        //     将集合中的每一个键值对，带入到BiFunction的方法中，使用接口方法的返回值替换集合中原来的值。
        map.replaceAll((k, v) -> {
            if (k.equals("height")) {
                return v + "cm";
            }
            return v;
        });

        // 11. 通过键获取值。
        String value10 = map.get("name1");
        System.out.println(value10);
        // 12. 通过键获取值，如果这个键不存在，则返回默认的值。
        String value11 = map.getOrDefault("name1","aaa");
        System.out.println(value11);

        // 13. 判断是否包含某一个键
        boolean value12 = map.containsKey("height");
        System.out.println(value12);

        boolean value13 = map.containsValue("177");
        System.out.println(value13);

        // 14. 获取由所有的键组成的Set集合
        Set<String> keys = map.keySet();
        //     获取由所有的值组成的Collection集合
        Collection<String> values = map.values();

        System.out.println(map);
    }
}
