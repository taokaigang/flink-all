package day22.cMap;

import java.util.LinkedHashMap;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description
 */
public class MapUsage3 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", "xiaoming");
        map.put("weight", "68");
        map.put("age", "20");
        map.put("height", "176");

        System.out.println(map);
    }
}
