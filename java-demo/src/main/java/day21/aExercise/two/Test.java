package day21.aExercise.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description 设计一个方法，删除一个集合中，所有的指定的元素。例如，将集合中所有的3都删除。
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 批量的在集合Collection集合中添加元素
        Collections.addAll(list, 10, 3, 11, 9, 8, 3, 2, 1, 0, 3, 4, 7, 4, 3, 2);

        two(list);

        System.out.println(list);
    }

    private static void one(List<Integer> list) {
        list.removeIf(ele -> ele.equals(3));
    }

    private static void two(List<Integer> list) {
        // 循环删除
        while (list.contains(3)) {
            list.remove(Integer.valueOf(3));
        }
    }


}
