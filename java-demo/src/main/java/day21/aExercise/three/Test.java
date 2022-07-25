package day21.aExercise.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description 设计一个方法，将一个存储有体重信息的集合，所有的数据乘2
 */
public class Test {
    public static void main(String[] args) {
        //
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 45, 50, 55, 57, 60, 53, 50, 49, 61, 65);
        // 将集合中的所有的元素都乘2
        list.replaceAll(ele -> ele * 2);

        System.out.println(list);
    }
}
