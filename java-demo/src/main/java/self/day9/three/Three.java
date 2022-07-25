package self.day9.three;

public class Three {
    /**
     * 3. 已知一个书签（BookMark）具有属性：页码和备注。根据以下代码段，完成类的设计。
     * @param args
     */
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
