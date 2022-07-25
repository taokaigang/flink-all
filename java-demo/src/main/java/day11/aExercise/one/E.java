package day11.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class E {
    public static void main(String[] args) {
        // 1. 实例化对象
        SubCar audi = new SubCar();

        // 2. 成员访问
        audi.mask = "奥迪";
        audi.speed = 0;
        audi.price = 100;
        audi.speedChange(120);


    }
}
