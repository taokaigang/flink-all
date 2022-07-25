package self.day8.B;

public class Program {
    /**
     * 2. （中）设计一个圆类，具有属性：圆心（点）、半径。添加一个方法：判断一个圆是否包含一个点
     * @param args
     */
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.center=new int[]{0, 0};
        circle.radius=5;

        boolean contain = circle.isContain(3,3);
        System.out.println(contain);

    }
}
