package day13.glambdaExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/8
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        // 1. 准备数据
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
        // 2. 对数组中的元素进行排序
        // 2.1. 按照年龄进行升序排列
        // sort(array, (p1, p2) -> p1.getAge() - p2.getAge());
        // 2.2. 按照身高进行升序排列
        // sort(array, (p1, p2) -> p1.getHeight() - p2.getHeight());
        // 2.3. 按照体重进行升序排列
        sort(array, (p1, p2) -> p1.getWeight() - p2.getHeight());

        for (Person person : array) {
            System.out.println(person);
        }
    }

    private static void sort(Person[] array, PersonComparator comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (comparator.compare(array[j], array[j+1]) > 0) {
                    Person tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
