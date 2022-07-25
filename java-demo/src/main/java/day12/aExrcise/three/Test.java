package day12.aExrcise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个Nurse对象
        Nurse nurse = new Nurse();

        // 2. 让保姆去买菜、做饭、洗衣服
        nurse.clean();
        nurse.buy();
        nurse.cook();
        nurse.wash();
    }
}
