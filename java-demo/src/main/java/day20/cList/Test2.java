package day20.cList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description 集合的元素排序
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 2. 增元素
        list.add("Lily");
        list.add("Lucy");
        list.add("Polly");
        list.add("Jim");

        // 排序
        list.sort((e1, e2) -> e1.length() - e2.length());
    }
}
