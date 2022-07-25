package day11.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Circle extends Shape {
    private double radius;  // 半径

    public void setRadius(double radius) {
        if (radius < 0) {
            return;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.setRadius(radius);
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
