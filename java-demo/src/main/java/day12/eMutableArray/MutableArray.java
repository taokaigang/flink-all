package day12.eMutableArray;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 *      可变的容器，用数组实现。
 */
public class MutableArray {
    // 声明一个私有的，String数组，这个数组才是真正存储数据的容器。
    private String[] elements;

    public MutableArray() {
        // 实例化一个新的MutableArray对象的时候，为这个数组分配空间
        this.elements = new String[0];
    }

    public int size() {
        return this.elements.length;
    }

    // 将元素添加到数组的最后位
    public void add(String element) {
        // 1. 实例化一个新的数组，将原来数组中的元素，拷贝到新的数组中
        String[] tmp = Arrays.copyOf(this.elements, this.elements.length + 1);
        // 2. 将需要添加的元素，存到tmp数组的最后位
        tmp[tmp.length - 1] = element;
        // 3. 重新定义属性elements的地址指向
        this.elements = tmp;
    }
    // 将元素element插入到数组中的第index位
    public void add(int index, String element) {
        // 0, 1, 2, 3, 4, 5  -> 3 ==> 100
        // 0, 1, 2, 100, 3, 4, 5
        // 1. 实例化一个新的数组，新数组的长度是原来数组的长度+1
        String[] tmp = new String[this.elements.length + 1];
        // 2. 将元素依次拷贝到新的数组中
        System.arraycopy(this.elements, 0, tmp, 0, index);      // 拷贝index位之前的元素
        tmp[index] = element;       // 将要插入的元素，放到index位
        System.arraycopy(this.elements, index, tmp, index + 1, this.elements.length - index);
        // 3. 重新定义属性elements的地址指向
        this.elements = tmp;
    }
    /*
    int j = 0;
    for (int i = 0; i < this.elements.length; i++) {
        if (j == index) {
            tmp[j++] = element;
            i--;
        }
        else {
            tmp[j++] = this.elements[i];
        }
    }
     */

    // 删除下标位1的元素
    public void remove(int index) {
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // 0, 1, 2, 3, 4, 6, 7, 8, 9
        // 1. 元素拷贝，将原数组中的第 index + 1 位的元素，依次向前覆盖
        System.arraycopy(this.elements, index + 1, this.elements, index, this.elements.length - 1 - index);
        // 2. 舍去最后一位
        this.elements =  Arrays.copyOf(this.elements, this.elements.length - 1);
    }

    public void remove(String element) {
        // 1. 找到这个元素在数组中第一次出现的下标
        // 2. 通过下标删除
        remove(indexOf(element));
    }

    public int indexOf(String element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        this.elements = new String[0];
    }


    // 修改指定下标位的元素
    public void set(int index, String element) {
        this.elements[index] = element;
    }

    // 获取指定下标位的元素
    public String get(int index) {
        return this.elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.elements);
    }
}
