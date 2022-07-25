package day11.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0){
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double length, double width) {
        this.setLength(length);
        this.setWidth(width);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
