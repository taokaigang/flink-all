package day21.aExercise.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description 设计一个方法，随机生成10个不重复的10以内的数字，存入一个List集合。
 */
public class Test {
    // 错误思路：随机生成一个数字，判断这个数字在集合中是否已经存在。如果存在，再重新生成；如果不存在，存入集合。
    // 新建一个存储所有可能随机到的数字的集合。随机一个下标，从数据源集合中获取元素，将获取到的元素从数据源中移除，添加到新的集合中。
    public static void main(String[] args) {
        // 1. 准备一个数据源，存储所有可能随机到的数字。
        List<Integer> dataSource = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataSource.add(i);
        }
        // 2. 实例化一个新的集合，用来存储最后得到的结果。
        List<Integer> result = new ArrayList<>();
        // 3. 随机从数据源中获取数据，存入到结果集合中。
        while (!dataSource.isEmpty()) {
            // 4. 随机一个下标
            int randomIndex = (int)(Math.random() * dataSource.size());
            // 5. 将这个下标的元素，添加到结果集合中
            result.add(dataSource.remove(randomIndex));
        }
        //
        System.out.println(result);
    }
}
