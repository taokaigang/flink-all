package day20.cList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description List接口的方法
 */
public class Test1 {
    public static void main(String[] args) {
        // 1. 实例化一个ArrayList对象，向上转型为接口类型。
        List<String> list = new ArrayList<>();

        // 2. 增元素
        list.add("Lily");
        list.add("Lucy");
        list.add("Polly");
        list.add("Jim");

        // 3. 在集合中指定的下标位插入元素
        list.add(2, "Tom");

        // 4. 在集合中指定的下标位插入另外一个集合中所有的数据
        list.addAll(2, list);

        // 5. 删除集合中指定下标位的元素
        //    返回值：这个被删除的元素
        System.out.println(list.remove(2));

        // 6. 修改指定下标位的值
        //    返回被覆盖的值。
        System.out.println(list.set(2, "AAA"));

        // 7. 获取指定下标位的元素。
        System.out.println(list.get(2));

        // 8. 获取集合中的某一个元素第一次出现的下标
        System.out.println(list.indexOf("Jim"));

        // 9. 获取集合中的某一个元素最后一次出现的下标
        System.out.println(list.lastIndexOf("Jim"));

        // 10. 从一个集合中，截取一部分，作为子集合。 [from, to)
        List<String> sub = list.subList(2, 60);

        // 11* 元素替换
        //     将集合中的每一个元素，带入到接口的方法中，用返回值替换原来的元素
        // list.replaceAll(ele -> ele.concat(".txt"));

        System.out.println(list);
        // System.out.println(sub);
    }
}
