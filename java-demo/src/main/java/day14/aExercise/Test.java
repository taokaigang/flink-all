package day14.aExercise;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        // 1. 准备数组
        Person[] array = new Person[]{
                new Person("xiaobai", 12, 166, 50),
                new Person("xiaohei", 11, 156, 55),
                new Person("xiaohuang", 19, 176, 70),
                new Person("xiaolv", 15, 164, 66),
                new Person("xiaocheng", 13, 136, 60),
                new Person("xiaohong", 17, 168, 45),
                new Person("xiaolan", 22, 169, 54),
                new Person("xiaozi", 10, 126, 59)
        };
        // 2. 方法测试
        ArrayOperations.sort(array, (p1, p2) -> p1.getAge() - p2.getAge());
        for (Person person : array) {
            System.out.println(person);
        }
        System.out.println("------------------------------------------");

        Person[] ret1 = ArrayOperations.get(array, p -> p.getHeight() > 160);
        for (Person person : ret1) {
            System.out.println(person);
        }
        System.out.println("------------------------------------------");

        Person[] ret3 = ArrayOperations.removeIf(array, p -> p.getWeight() < 60);
        for (Person person : ret3) {
            System.out.println(person);
        }
        System.out.println("------------------------------------------");

        Person max = ArrayOperations.getMax(array, (p1, p2) -> p1.getHeight() - p2.getHeight());
        System.out.println(max);
    }
}
