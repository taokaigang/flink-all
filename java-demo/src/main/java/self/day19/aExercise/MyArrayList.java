package self.day19.aExercise;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> {
    private T[] elements;

    public  MyArrayList() {
        //this.part =(T[]) (new Object[0]);
        this.elements = (T[]) new Object[0];//要做类型检查，所以会有警告@...   可以忽略
    }

    public T[] getPart() {
        return elements;
    }

    public void setPart(T[] part) {
        this.elements = part;
    }

    public int size(){
        return this.elements.length;
    }

    // 将元素添加到数组的最后位
    public void add(T element) {
        // 1. 实例化一个新的数组，将原来数组中的元素，拷贝到新的数组中
        T[] tmp = Arrays.copyOf(this.elements, this.elements.length + 1);
        // 2. 将需要添加的元素，存到tmp数组的最后位
        tmp[tmp.length - 1] = element;
        // 3. 重新定义属性elements的地址指向
        this.elements = tmp;
    }
    // 删除下标位1的元素
    public void remove(int index) {
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // 0, 1, 2, 3, 4, 6, 7, 8, 9
        // 1. 元素拷贝，将原数组中的第 index + 1 位的元素，依次向前覆盖
        System.arraycopy(this.elements, index + 1, this.elements, index, this.elements.length - 1 - index);
        // 2. 舍去最后一位
        this.elements =  Arrays.copyOf(this.elements, this.elements.length - 1);
    }

    public int indexOf(T element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public void remove(T element) {
        // 1. 找到这个元素在数组中第一次出现的下标
        // 2. 通过下标删除
        remove(indexOf(element));
    }

    public void clear() {
        this.elements = (T[]) new Object[0];
    }

    // 获取指定下标位的元素
    public T get(int index) {
        return this.elements[index];
    }
    // 修改指定下标位的元素
    public void set(int index, T element) {
        this.elements[index] = element;
    }

    public void sort(Comparator<T> comparator){
            for (int i = 0; i < this.elements.length - 1; i++) {
                for (int j = 0; j < this.elements.length - 1 - i; j++) {
                    if (comparator.compare(this.elements[j], this.elements[j+1]) > 0) {
                        T tmp = this.elements[j];
                        this.elements[j] = this.elements[j+1];
                        this.elements[j+1] = tmp;
                    }
                }
            }

    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "part=" + Arrays.toString(elements) +
                '}';
    }
}
