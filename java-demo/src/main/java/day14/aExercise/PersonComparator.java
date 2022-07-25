package day14.aExercise;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 */
@FunctionalInterface
public interface PersonComparator {
    int compare(Person p1, Person p2);
}
