package day7.bArray;

/**
 * 数组的高阶应用，关于数组的 “扩容”，“删除”...
 */
public class ArrayUsage {
    public static void main(String[] args) {
        // 需求：已知有一个数组，将一个元素添加到这个数组的最后位
        //      { 1, 2, 3, 4, 5 } + 6 => { 1, 2, 3, 4, 5, 6 }

        int[] array = { 1, 2, 3, 4, 5 };
        int[] result = add(array, 6);
        for (int i : result) {
            System.out.println(i);
        }
    }

    /**
     * 希望在数组array的最后，拼接一个元素element
     * @param array 数组
     * @param element 拼接的元素
     * @return 数组的长度是不可变的，如果要进行“拼接”，则一定意味着生成了一个新的数组
     */
    static int[] add(int[] array, int element) {
        // 1. 实例化一个新的数组，作为拼接之后的数组，新数组的长度应该是原数组长度+1
        int[] newArray = new int[array.length + 1];
        // 2. 将原来数组中的元素，都拷贝到新的数组中。
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        // 3. 将需要拼接的元素，存储到新数组的最后位。
        newArray[newArray.length - 1] = element;
        // 4. 返回新的数组
        return newArray;
    }
}
