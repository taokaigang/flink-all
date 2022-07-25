package day12.cInterfaceTest.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
public class Program {

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
        // 2. 如果需要按照年龄进行排序
        // sort(array, new PersonComparatorImplAge());
        // 如果需要按照身高进行排序
        // sort(array, new PersonComparatorImplHeight());
        // 如果需要按照体重进行排序
        sort(array, new PersonComparatorImplWeight());

        for (Person person : array) {
            System.out.println(person);
        }
    }

    // 已知方法如下，可以实现对一个数组中的元素，按照指定规则排序。实现下面方法。
    // 注意: 但凡是一个参数的意义，是为了提供一个条件、规范。此时这个类型就需要设计为接口类型。
    public static void sort(Person[] array, PersonComparator comparator) {
        // 如果按照年龄进行升序排序
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                // 使用接口中提供的Person对象的大小比较的规则，对两个Person对象进行大小比较
                if (comparator.compare(array[minIndex], array[j]) > 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Person tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }
        }
    }
}
