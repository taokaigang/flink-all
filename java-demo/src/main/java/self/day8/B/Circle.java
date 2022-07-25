package self.day8.B;

public class Circle {
    int[] center;//圆心

    int radius;//半径

    boolean isContain(int x,int y){
        double distance=Math.sqrt(Math.pow(x-center[0],2)+Math.pow(y-center[1],2));
        if (distance<radius){
            return true;
        }else {
            return false;
        }
    }

}
