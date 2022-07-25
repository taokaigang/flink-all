package day10.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1、实例化一个书签对象，并给每一个属性赋值
        BookMark mark1 = new BookMark();
        mark1.setName("三打白骨精");
        mark1.setPage(10);

        // 2、实例化一个书签对象，并给每一个属性赋值
        BookMark mark2 = new BookMark("女儿国", 30);

        // 3、比较两个书签的大小（通过页码比较）
        // 比较结果：
        // 1 : mark1 > mark2
        // 0 : mark1 == mark2
        // -1: mark1 < mark2
        int result = mark1.compareTo(mark2);
        System.out.println(result);
    }
}
