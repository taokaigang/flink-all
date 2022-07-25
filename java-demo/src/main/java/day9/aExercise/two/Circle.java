package day9.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Circle {
    Point center;       // 圆心，是一个点
    double radius;      // 半径，是一个数值

    /**
     * 判断当前的圆，是否包含指定的点
     * @param point 是否要包含的点
     * @return 包含关系
     */
    boolean contains(Point point) {
        // 思路：计算point点和center的距离，和半径进行比较即可
        double distance = (center.x - point.x) * (center.x - point.x) + (center.y - point.y) * (center.y - point.y);

        return radius * radius >= distance;
    }
}
