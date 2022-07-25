package self.day8.C;

public class Program {
    /**
     * 3. （中）设计一个点类，具有属性：x、y坐标，具有方法：和另外一个点相加，得到一个新的点，新的点的x
     * 坐标是原来两个点的x坐标和，y是原来两个点的y坐标和
     * @param args
     */
    public static void main(String[] args) {

        Dot dot=new Dot();
        dot.x=1;
        dot.y=1;

        dot.sum(2,2);

    }
}
