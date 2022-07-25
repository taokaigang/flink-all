package self.exercise;

public class Circle {
    private Dot dot;
    private int r;

    public Circle() {
    }

    public Circle(Dot dot, int r) {
        this.dot = dot;
        this.r = r;
    }

    public Dot getDot() {
        return dot;
    }

    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "dot=" + dot +
                ", r=" + r +
                '}';
    }


    public void relation(Circle circle){
        double com=this.getR()+circle.getR();
        double a=Math.sqrt(Math.pow(this.getDot().getX()-circle.getDot().getX(),2)+Math.pow(this.getDot().getY()-circle.getDot().getY(),2));
        if (com==a){
            System.out.println("两圆相切");
        }else if (com < a){
            System.out.println("两圆相离");
        }else {
            System.out.println("两圆相交");
        }

    }
}
