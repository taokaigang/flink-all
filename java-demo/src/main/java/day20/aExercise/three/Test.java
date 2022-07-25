package day20.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description
 *  【难】设计一个MyArrayList类，实现不定长度实现的基本功能:
 *      1. MyArrayList中添加的元素，可以通过泛型进行限定
 *      2. 向MyArrayList中添加元素
 *      3. 从MyArrayList中删除元素（按照下标删除、按照元素删除、清空所有）
 *      4. 通过下标，获取元素
 *      5. 通过下标，修改元素
 *      6. 将MyArrayList中的元素进行升序排序
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个集合对象
        MyArrayList<Integer> list = new MyArrayList<>();

        // 2. 添加元素
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);

        list.sort((e1, e2) -> e1 - e2);

        System.out.println(list);
    }
}
