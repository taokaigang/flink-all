package self.day20.aExercise;

import java.util.ArrayList;
import java.util.List;

public class Three {
    /**
     * 3. 【简】设计一个方法，将一个存储有体重信息的集合，所有的数据乘2
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(55);
        getDouble(list);
        list.forEach(System.out::println);
    }
    private static void getDouble(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);
        }
    }
}
