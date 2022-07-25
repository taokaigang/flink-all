package self.day10.one;

public class SubCar extends Car {
        public int price;
        public int speed;

    public SubCar() {
    }

    public SubCar(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    public SubCar(String mark) {
        super(mark);
    }

    public SubCar(String mark, int price, int speed) {
        super(mark);
        this.price = price;
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SubCar{" +
                "price=" + price +
                ", speed=" + speed +
                '}';
    }

    public void speedChange(int newSpeed){
            System.out.println("速度由"+speed+"变为"+newSpeed);
        }
}
