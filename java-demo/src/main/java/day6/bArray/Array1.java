package day6.bArray;

/**
 * 数组的声明和实例化
 *      实例化：为数组开辟空间，进行初始化的赋值操作。
 *
 * 各种数据类型的默认值：
 *      整型： 0
 *      浮点型： 0.0
 *      字符型： '\u0000'
 *      布尔型： false
 *      引用类型： null
 */
public class Array1 {
    public static void main(String[] args) {
        // 1. 声明一个数组
        // 1.1. 实例化一个数组，数组的长度是10
        //      使用这种方式的实例化，数组中填充的是该种数据类型的默认值
        // int[] array = new int[10];

        // 1.2. 通过数组中的初始值，实例化一个数组
        //      此时，通过大括号中的数据数量，推导出数组的长度
        //      此时，数组中填充的不再是0，而是默认的 1,2,3,4,5 五个值
        // int[] array = new int[] { 1, 2, 3, 4, 5 };

        // 1.3. 在第二种方式中，可以省略掉 new int[]
        int[] array = { 1, 2, 3, 4, 5 };
    }
}
