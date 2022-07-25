package day29.aExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description
 */
public class BUG {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> sublist = new ArrayList<>(list.subList(3, 9));
        sublist.add(123);

        list.add(11);

        sublist.forEach(System.out::println);
    }
}
