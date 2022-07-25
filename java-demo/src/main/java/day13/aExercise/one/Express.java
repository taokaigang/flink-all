package day13.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
class Shunfeng implements SendPackageByAirService, SendPackageByLandService {
    @Override
    public void sendPackageByLand() {
        System.out.println("顺丰快递发陆运");
    }

    @Override
    public void sendPackageByAir() {
        System.out.println("顺丰快递发空运");
    }
}
class EMS implements SendPackageByAirService {
    @Override
    public void sendPackageByAir() {
        System.out.println("EMS发空运");
    }
}
class Yuantong implements SendPackageByLandService {
    @Override
    public void sendPackageByLand() {
        System.out.println("圆通快递发陆运");
    }
}
