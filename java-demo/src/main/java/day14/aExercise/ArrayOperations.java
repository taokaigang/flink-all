package day14.aExercise;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 */
public class ArrayOperations {
    // 以指定的大小比较规则，比较数组中的元素，实现对数组中的元素进行升序排序
    public static void sort(Person[] persons, PersonComparator comparator) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                // 这一题最核心的部分: 下方的对象的比较
                // 使用自定义的比较规则，对两个Person对象进行大小比较
                if (comparator.compare(persons[j], persons[j+1]) > 0) {
                    Person tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }
    }

    // 获取满足条件的数据， 并存入到一个数组中， 将这个数组返回
    // 例如： 获取数组中所有的年龄 > 10的数据
    public static Person[] get(Person[] persons, PersonPredicate predicate) {
        // 1. 实例化一个数组，用来存储所有的满足条件的数据
        //    这个数组在实例化的时候，假设所有的数据都是满足条件的
        Person[] tmp = new Person[persons.length];
        // 2. 声明一个变量，用来标记当前数组中存储了多少个数据
        int count = 0;
        // 3. 遍历原数组中的每一个元素
        for (Person person : persons) {
            // 4. 依次判断每一个元素是否是满足条件的元素
            if (predicate.matches(person)) {
                tmp[count++] = person;
            }
        }
        // 5. 截取tmp数组中的有效的数据，并返回
        return Arrays.copyOf(tmp, count);
    }

    // 删除数组中所有的满足条件的数据，并返回存储有所有的满足条件的数据
    public static Person[] removeIf(Person[] persons, PersonPredicate predicate) {
        // 1. 实例化一个数组，用来存储所有的不满足条件的数据
        //    这个数组在实例化的时候，假设所有的数据都是不满足条件的
        Person[] tmp = new Person[persons.length];
        // 2. 声明一个变量，用来标记当前数组中存储了多少个数据
        int count = 0;
        // 3. 遍历原数组中的每一个元素
        for (Person person : persons) {
            // 4. 依次判断每一个元素是否是满足条件的元素
            if (!predicate.matches(person)) {
                tmp[count++] = person;
            }
        }
        // 5. 截取tmp数组中的有效的数据，并返回
        return Arrays.copyOf(tmp, count);
    }

    // 获取按照指定的规则进行对象大小比较时，最大的元素
    public static Person getMax(Person[] persons, PersonComparator comparator) {
        // 1. 假设第0个元素就是最大值
        Person max = persons[0];
        // 2. 依次遍历每一个元素，每当发现了比max还大的元素的时候，更新max的值
        for (Person person : persons) {
            if (comparator.compare(person, max) > 0) {
                max = person;
            }
        }
        return max;
    }
}
