package day20.aExercise.three;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/17
 * @Description 自定义的集合类，通过泛型，限定了存储元素的类型
 * 【难】设计一个MyArrayList类，实现不定长度实现的基本功能:
 *      1. MyArrayList中添加的元素，可以通过泛型进行限定
 *      2. 向MyArrayList中添加元素
 *      3. 从MyArrayList中删除元素（按照下标删除、按照元素删除、清空所有）
 *      4. 通过下标，获取元素
 *      5. 通过下标，修改元素
 *      6. 将MyArrayList中的元素进行升序排序
 */
public class MyArrayList<E> {
    // 核心: 需要有一个真正存储数据的容器
    private E[] elements;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.elements = (E[])new Object[0];
    }

    public int size() {
        return this.elements.length;
    }

    /**
     * 添加元素
     * @param ele 要添加的元素
     */
    public void add(E ele) {
        // E[] copy = Arrays.copyOf(this.elements, size() + 1);
        // copy[size()] = ele;
        // this.elements = copy;

        this.elements = Arrays.copyOf(this.elements, size() + 1);
        this.elements[size() - 1] = ele;
    }

    /**
     * 按照下标删除元素
     * @param index 需要删除的下标
     */
    public void remove(int index) {
        // 将这个下标位后面的元素依次向前覆盖一位
        System.arraycopy(this.elements, index + 1, this.elements, index, size() - 1 - index);
        this.elements = Arrays.copyOf(this.elements, size() - 1);
    }

    /**
     * 按照元素删除
     * @param ele 要删除的元素
     */
    public void remove(E ele) {
        remove(indexOf(ele));
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        this.elements = (E[])new Object[0];
    }

    public void set(int index, E ele) {
        this.elements[index] = ele;
    }

    public E get(int index) {
        return this.elements[index];
    }

    /**
     * 查找某一个元素的下标
     * @param ele 要查找的元素
     * @return 下标
     */
    public int indexOf(E ele) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.elements);
    }

    public void sort(MyComparator<E> comparator) {
        for (int i = 0; i < this.elements.length - 1; i++) {
            for (int j = 0; j < this.elements.length - 1 - i; j++) {
                if (comparator.compare(this.elements[j], this.elements[j+1]) > 0) {
                    E tmp = this.elements[j];
                    this.elements[j] = this.elements[j+1];
                    this.elements[j+1] = tmp;
                }
            }
        }
    }
}

interface MyComparator<E> {
    int compare(E e1, E e2);
}
