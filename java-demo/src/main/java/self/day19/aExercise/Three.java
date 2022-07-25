package self.day19.aExercise;


public class Three {
    /**
     * 3. 【难】设计一个MyArrayList类，实现不定长度实现的基本功能:
     *      1. MyArrayList中添加的元素，可以通过泛型进行限定
     *      2. 向MyArrayList中添加元素
     *      3. 从MyArrayList中删除元素（按照下标删除、按照元素删除、清空所有）
     *      4. 通过下标，获取元素
     *      5. 通过下标，修改元素
     *      6. 将MyArrayList中的元素进行升序排序
     * @param args
     */
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList=new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        System.out.println(myArrayList);
        myArrayList.remove(1);
        System.out.println(myArrayList);
        myArrayList.remove(Integer.valueOf(30));
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println(myArrayList);


    }

}
