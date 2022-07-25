package day12.cInterfaceTest.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      提供两个Person对象进行大小比较的依据
 */
public interface PersonComparator {
    /**
     * 对两个Person对象进行大小的比较
     * @param person1 参与比较的Person对象
     * @param person2 参与比较的Person对象
     * @return
     *      > 0 : person1 > person2
     *      < 0 : person1 < person2
     *      == 0 : person1 == person2
     */
    int compare(Person person1, Person person2);
}
