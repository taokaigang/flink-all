package day11.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class SubCar extends Car {
    public int price;
    public int speed;

    public void speedChange(int newSpeed) {
        if (newSpeed < 0) {
            newSpeed = 0;
        }

        this.speed = newSpeed;
    }
}
