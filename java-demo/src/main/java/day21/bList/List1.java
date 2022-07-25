package day21.bList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description List集合遍历
 */
public class List1 {
    public static void main(String[] args) {
        // 1. 实例化一个List集合，存储若干数据
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        // 2. 遍历
        // index(list);
        listIterator(list);
    }

    /**
     * 使用列表迭代器完成遍历
     * @param list 需要遍历的集合
     */
    private static void listIterator(List<Integer> list) {
        // 1. 获取到 ListIterator 对象
        ListIterator<Integer> iterator = list.listIterator(4);
        // 2. 循环遍历
        while (iterator.hasNext()) {
            // 2.1. 获取迭代器当前指向的元素
            Integer ele = iterator.next();
            System.out.println(ele);
            // 2.2. 元素操作
            if (ele == 30) {
                // 添加：在迭代器当前指向的元素的下一位插入一个元素
                // 新增的元素，没有存在于迭代列表中，迭代器会直接指向原集合中的下一个元素
                // iterator.add(300);
                // 删除：删除迭代器当前指向的这一位元素
                // iterator.remove();
                // 修改：修改迭代器当前指向的这一位元素
                // iterator.set(300);
            }
        }

        System.out.println(list);
    }

    /**
     * 下标遍历法
     * @param list 需要遍历的集合
     */
    private static void index(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            // 获取每一个元素
            System.out.println(list.get(i));
        }
    }
}
