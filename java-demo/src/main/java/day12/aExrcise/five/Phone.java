package day12.aExrcise.five;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Phone implements Typec, ProtectedFromWater {
    @Override
    public void protectedFromWater() {
        System.out.println("这个手机是防水的");
    }

    @Override
    public void dataTransformation() {
        System.out.println("采用了USB-C进行数据的传递");
    }
}
