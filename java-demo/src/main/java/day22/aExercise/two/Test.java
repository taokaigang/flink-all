package day22.aExercise.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description 随机生成10个[1, 30]内的随机数，存入到一个List集合中，对集合进行降序的排列。并输出排序后的集合中大于10的数据。
 */
public class Test {
    public static void main(String[] args) {
        // 1. 生成10个 [1,30] 范围内的随机数
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(30) + 1);
        }

        // 2. 对集合进行降序排序
        list.sort((n1, n2) -> n2 - n1);

        // 3. 输出排序后的集合中大于10的数据
        for (Integer element : list) {
            // 判断元素是否 <= 10
            // 现在集合已经是降序排列了。如果出现了一个 <= 10的数据，后序的所有的数据一定是 <=10 的
            if (element <= 10) {
                break;
            }
            System.out.println(element);
        }

        list.forEach(ele -> {
            if (ele > 10) {
                System.out.println(ele);
            }
        });
    }
}
