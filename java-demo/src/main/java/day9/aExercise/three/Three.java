package day9.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 * （中）设计一个点类，具有属性：x、y坐标，具有方法：和另外一个点相加，得到一个新的点，新的点的x坐标是原来两个点的x坐标和，y是原来两个点的y坐标和
 */
public class Three {
    public static void main(String[] args) {
        // 1. 实例化两个点对象
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;

        Point p2 = new Point();
        p2.x = 15.5;
        p2.y = 18.2;

        // 2. 让两个点相加
        Point point = p1.add(p2);

        System.out.println(point.x);
        System.out.println(point.y);
    }
}
