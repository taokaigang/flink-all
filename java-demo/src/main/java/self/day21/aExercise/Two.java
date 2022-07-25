package self.day21.aExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Two {
    /**
     * 2. 【简】随机生成10个[1,30]内的随机数，存入到一个List集合中，对集合进行降序的排列。并输出排
     * 序后的集合中大于10的数据。
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            int r=random.nextInt(30)+1;
            list.add(r);
        }
        list.sort((a1,a2)->a2-a1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>10)
            System.out.println(list.get(i));
        }

    }
}
