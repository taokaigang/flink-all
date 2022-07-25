package self.day10.two;

public class Two {
    /**
     * 2.# 编写一个类Shape，声明计算图形面积的方法。再分别定义Shape的子类Circle（圆）和Rectangle（矩
     * 形），在两个子类中按照不同图形的面积计算公式，实现Shape类中计算面积的方法。
     * @param args
     */
    public static void main(String[] args) {
        Circle circle = new Circle(1);//创建圆形对象并将半径设置成1
        circle.setName("圆形");
        System.out.println("图形的名称是：" + circle.getName());
        System.out.println("图形的面积是：" + circle.getArea());
        Rectangle rectangle = new Rectangle(1, 1);//创建矩形对象并将长和宽设置成1
        rectangle.setName("矩形");
        System.out.println("图形的名称是：" + rectangle.getName());
        System.out.println("图形的面积是：" + rectangle.getArea());
    }
}
