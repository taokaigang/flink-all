package day12.aExrcise.four;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        test(new Cat());
        test(new Dog());
    }

    public static void test(Animal animal) {
        // 判断这个动物是猫还是狗
        if (animal instanceof Cat) {
            System.out.println("是一只猫");
        }
        else if (animal instanceof Dog) {
            System.out.println("是一只狗");
        }
        else {
            System.out.println("是其他的动物");
        }
    }
}
