package self.day20.aExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class One {
    /**
     * 1. 【中】设计一个方法，随机生成10个不重复的10以内的数字，存入一个List集合。
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        getUnrepeatedNumber(list);

        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    private static void getUnrepeatedNumber(List<Integer> list){
        Random random=new Random();
        for (int i = 0; i < 10; ) {
            int r = random.nextInt(10);
            if ( ! list.contains(r)){
                list.add(i++,r);
            }
        }
    }
}
