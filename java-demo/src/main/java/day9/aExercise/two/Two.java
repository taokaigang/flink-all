package day9.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 *  （中）设计一个圆类，具有属性：圆心（点）、半径。添加一个方法：判断一个圆是否包含一个点。
 */
public class Two {
    public static void main(String[] args) {
        // 1. 实例化一个圆心
        Point center = new Point();
        center.x = 10;
        center.y = 20;
        // 2. 实例化一个圆
        Circle circle = new Circle();
        circle.center = center;
        circle.radius = 3;

        // 3. 实例化一个点，作为判断的点
        Point point = new Point();
        point.x = 11;
        point.y = 15;

        // 4. 判断是否包含
        boolean contains = circle.contains(point);
        System.out.println(contains ? "包含" : "不包含");
    }
}
