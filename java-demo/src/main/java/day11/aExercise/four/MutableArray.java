package day11.aExercise.four;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description
 *      思路：这个类是一个容器类，容器中存储的数据数量是可以随时改动的。
 *      暂时只考虑存储 String 类型的数据。
 *
 *      数组版：
 *      核心思路：定义一个私有的数组，作为真实的数据存储的容器
 */
public class MutableArray {
    // 这个是一个真实的数据存储的容器
    private String[] array;

    public MutableArray() {
        // 实例化，初始元素数量为0
        this.array = new String[0];
    }

    public void add(String ele) {
        // 1. 实例化一个新的数组，新数组的长度是原来数组的长度+1
        // 2. 将原来数组中的元素，依次拷贝到这个新的数组中
        String[] newArray = Arrays.copyOf(this.array, this.array.length + 1);
        // 3. 将需要添加的元素，拼接到新数组的最后位
        newArray[newArray.length - 1] = ele;
        // 4. 重要：重新设置属性array的地址指向
        this.array = newArray;
    }





    public void set(int index, String element) {
        this.array[index] = element;
    }

    public String get(int index) {
        return this.array[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
