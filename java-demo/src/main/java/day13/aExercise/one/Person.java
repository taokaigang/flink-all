package day13.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Person {
    // 添加两个方法，分别用来发陆运和空运

    /*
        思路:
        如果设计方法的时候，实参可以是多种类型，
        例如，这里SendByLand，参数可以是Shunfeng，也可以是Yuantong, 此时一定要想到用多态。

        1. 多态，有类与类之间的多态、类与接口之间的多态。
        2. 如果使用类与类之间的多态。
            由Shunfeng和Yuantong抽取一个父类，描述可以发陆运的快递
            由Shunfeng和EMS抽取一个父类，描述可以发空运的快递
            这样一来，Shunfeng就有了两个父类。与Java的单继承不符。
        3. 此时，只能使用接口之间的多态。
            设计一个接口，描述发空运的能力。设计一个接口，描述发陆运的能力。
            如果某一个快递公司需要发空运，只需要实现相关的接口即可。
     */

    public void sendPackageByLand(SendPackageByLandService express) {
        // 无论是什么快递，只能是可以发陆运的，直接发送陆运即可
        express.sendPackageByLand();
    }

    public void sendPackageByAir(SendPackageByAirService express) {
        // 无论是什么快递，只能是可以发空运的，直接发送空运即可
        express.sendPackageByAir();
    }
}
