package day11.bCode;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 */
public class ZooManager {
    // 某一个动物园管理员，需要将动物的信息录入到系统中
    // 录入系统：直接输出这个动物的名字即可
    // 额外要求：如果动物是老虎，再额外输出性别

    // save(new Tiger());
    // 用父类型，对所有的动物进行统一的处理
    public void save(Animal animal) {
        System.out.println(animal.name);
        // 针对老虎进行特殊的处理
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger)animal;
            System.out.println(tiger.gender);
        }
    }
}
