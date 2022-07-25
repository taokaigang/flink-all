package day11.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class Program {
    /*
        编写一个类Shape，声明计算图形面积的方法。
        再分别定义Shape的子类Circle（圆）和Rectangle（矩形），
        在两个子类中按照不同图形的面积计算公式，实现Shape类中计算面积的方法。
     */
    public static void main(String[] args) {
        // 1. 实例化一个圆
        Circle circle = new Circle(10.5);
        System.out.println("圆的面积是：" + circle.getArea());

        // 2. 实例化一个矩形
        Rectangle rectangle = new Rectangle(10, 18.5);
        System.out.println("矩形的面积是：" + rectangle.getArea());
    }
}
