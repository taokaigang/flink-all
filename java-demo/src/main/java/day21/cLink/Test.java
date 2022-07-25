package day21.cLink;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/20
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个集合
        MyLinkedList<String> list = new MyLinkedList<>();

        // 2. 新增元素
        list.add("Lily");
        list.add("Polly");
        list.add("Xiaoming");
        list.add("xiaohong");

        list.add(0, "Uncle Wang");
        list.add(1, "Han Meimei");
        list.add(6, "Jim");
        // list.add(11, "aaa");

        list.remove(3);

        System.out.println(list);
    }
}
