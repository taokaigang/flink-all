package day6.cArray;

public class Program {
    // 引用数据类型的表现
    public static void main(String[] args) {

        int[] array = { 10 };
        // 在参数传递的时候，传递的其实是数组的首元素地址
        change(array);
        System.out.println(array[0]);
    }

    static void change(int[] array) {
        // array[0] = 100;
        array = new int[]{100};
    }

}
