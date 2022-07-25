package day9.aExercise.four;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Four {
    // 设计一个人类，具有属性：姓名、年龄。
    // 在主方法中，实例化10个人类对象，存入一个数组。
    // 将数组中的元素按照年龄进行升序排序。遍历输出每一个人的信息
    public static void main(String[] args) {
        // 1. 实例化一个数组，长度为10，存储Person对象
        Person[] array = new Person[10];
        // 2. 填充元素
        fill(array);
        // 3. 排序
        sort(array);
        // 4. 遍历
        for (Person person : array) {
            System.out.println(person.getInfo());
        }
    }

    static void sort(Person[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;   // 用来记录最小值的下标
            for (int j = i + 1; j < array.length; j++) {
                // 比较两个元素的大小关系，在这里我们需要使用两个对象的年龄进行大小比较
                if (array[minIndex].age > array[j].age) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Person tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }

    static void fill(Person[] array) {
        String[] names = { "小白", "小黑", "老王", "老李", "老孙头", "老刘头", "老赵头", "小王", "老张", "老司机" };
        int[] ages = { 19, 22, 46, 10, 26, 35, 28, 30, 9, 11 };

        // 填充数组，因为此时数组中的元素都是null
        for (int i = 0; i < array.length; i++) {
            array[i] = new Person();
            array[i].name = names[i];
            array[i].age = ages[i];
        }
    }
}
