package day13.glambdaExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 *      定义了两个Person对象进行大小比较的依据
 */
@FunctionalInterface
public interface PersonComparator {
    int compare(Person p1, Person p2);
}
