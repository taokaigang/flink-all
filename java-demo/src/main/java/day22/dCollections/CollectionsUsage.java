package day22.dCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description
 */
public class CollectionsUsage {
    public static void main(String[] args) {
        // 1. 实例化一个List集合对象
        List<Integer> list = new ArrayList<>();

        // 2. 添加元素
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        // 3. 获取一个集合中的最大值，大小比较通过元素对应的类实现的Comparable接口进行比较
        Integer max = Collections.max(list);
        //    获取一个集合中的最大值，大小比较通过第二个参数 Comparator
        Integer max2 = Collections.max(list, (i1, i2) -> i2 - i1);

        // 4. 获取一个集合中的最小值，大小比较通过元素对应的类实现的Comparable接口进行比较
        Integer min = Collections.min(list);
        //    获取一个集合中的最小值，大小比较通过第二个参数 Comparator
        Integer min2 = Collections.min(list, (i1, i2) -> i2 - i1);

        // 5. 将List集合中的数据进行随机的排列（洗牌）
        Collections.shuffle(list);

        // 6. 交换一个List集合中两个下标对应的元素
        Collections.swap(list, 0, 2);

        // 7. 将一个List集合中的元素倒序排列
        Collections.reverse(list);

        // 8. 将一个List集合进行排序，元素的大小比较规则使用元素对应的类实现的Comparable接口进行比较大小
        Collections.sort(list);
        //    将一个List集合按照指定的规则进行升序排序，基本不用，List集合中本身就有这样的排序方法
        Collections.sort(list, (i1, i2) -> i2 - i1);

        // 9. 集合中的元素拷贝，将第二个参数集合中的数据拷贝到第一个集合中
        List<Integer> copy = new ArrayList<>();
        Collections.addAll(copy, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Collections.copy(copy, list);

        // 10. 使用指定的数据，填充一个集合
        Collections.fill(list, 0);

        // 11. 将线程不安全的集合，转成线程安全的集合
        // Collections.synchronizedCollection()
        // Collections.synchronizedList()
        // Collections.synchronizedSet()
        // Collections.synchronizedMap()

    }
}
