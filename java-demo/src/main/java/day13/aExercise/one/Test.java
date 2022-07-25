package day13.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 实例化一个小明
        Person xiaoming = new Person();

        // 2. 小明发送快递
        xiaoming.sendPackageByAir(new Shunfeng());
        xiaoming.sendPackageByAir(new EMS());

        xiaoming.sendPackageByLand(new Shunfeng());
        xiaoming.sendPackageByLand(new Yuantong());

        // xiaoming.sendPackageByAir(new Yuantong());   // 由于Yuantong没有实现空运接口，不支持空运
        // xiaoming.sendPackageByLand(new EMS());       // 由于EMS没有实现陆运的接口，不支持陆运
    }
}
