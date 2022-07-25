package day14.aExercise;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 */
@FunctionalInterface
public interface PersonPredicate {
    // 验证一个Person对象，是否满足方法实现中指定的逻辑
    boolean matches(Person person);
}
