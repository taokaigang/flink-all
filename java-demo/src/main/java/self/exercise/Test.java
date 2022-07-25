package self.exercise;

public class Test {
    //1. 求两点之间的距离
    public static void main(String[] args) {

        Dot dot1=new Dot(30.0,0.0);
        Dot dot2=new Dot(0.0,40.0);


        double distance= dot1.sum(dot2);
        System.out.println(distance);

    }
}
