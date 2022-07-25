package day12.aExrcise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      alt + enter: IDEA会自动的检测错误的修复方案。可以使用这个快捷键，一键修复错误。
 */
public class Nurse implements HouseService {

    @Override
    public void clean() {
        System.out.println("保姆在扫地");
    }

    @Override
    public void wash() {
        System.out.println("保姆在洗衣服");
    }

    @Override
    public void buy() {
        System.out.println("保姆在买菜");
    }

    @Override
    public void cook() {
        System.out.println("保姆在做饭");
    }
}
