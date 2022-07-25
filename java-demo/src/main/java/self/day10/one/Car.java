package self.day10.one;

public class Car {
    public String mark;

    public Car() {
    }

    public Car(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                '}';
    }

    public void drive(){
        System.out.println("共有属性drive");
    }
}
