package day9.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Point {
    double x;
    double y;

    Point add(Point p) {
        // 1. 实例化一个新的点，作为相加的结果
        Point point = new Point();
        // 2. 计算属性值
        point.x = x + p.x;
        point.y = y + p.y;
        // 3. 返回这个点
        return point;
    }
}
