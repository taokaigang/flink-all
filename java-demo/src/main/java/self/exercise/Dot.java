package self.exercise;

public class Dot {
    private double x;
    private double y;

    public Dot() {
    }

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double sum(Dot dot){
        return Math.sqrt(Math.pow(this.getX() - dot.getX(), 2) + Math.pow(this.getY() - dot.getY(), 2));
    }
}
