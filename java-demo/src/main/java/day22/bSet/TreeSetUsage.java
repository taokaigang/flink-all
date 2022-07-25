package day22.bSet;

import java.util.Collections;
import java.util.TreeSet;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description
 */
public class TreeSetUsage {
    public static void main(String[] args) {
        // 1. 实例化一个TreeSet对象
        TreeSet<Integer> sets = new TreeSet<>();
        Collections.addAll(sets, 10, 9, 8, 11, 12, 71, 9, 20, 16, 15, 10, 22);
        System.out.println(sets);
    }
}
