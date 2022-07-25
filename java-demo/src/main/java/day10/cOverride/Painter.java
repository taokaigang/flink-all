package day10.cOverride;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 *      绘画师
 */
public class Painter {
    public void draw() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}

class SubPainter extends Painter {
    // 父类的需求：
    //    在画九九乘法表之前，输出：开始画九九乘法表了！
    //    在画九九乘法表之后，输出：九九乘法表画完了！
    @Override
    public void draw() {
        System.out.println("开始画九九乘法表了！");
        super.draw();
        System.out.println("九九乘法表画完了！");
    }
}

class Test {
    public static void main(String[] args) {
        // 1. 实例化一个画家
        SubPainter painter = new SubPainter();
        painter.draw();
    }
}
