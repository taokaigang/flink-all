package self.day28.aExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Pokers {
    private String[] numbers;
    private String[] colors;
    //创建一个Map集合,存储牌的索引和组装好的牌
    private HashMap<Integer,String> pokers = new HashMap<>();
    //创建一个List集合,存储牌的索引
    private ArrayList<Integer> pokerIndex = new ArrayList<>();

    public String[] getNumbers() {
        return numbers;
    }

    public String[] getColors() {
        return colors;
    }

    public HashMap<Integer, String> getPoker() {
        return pokers;
    }

    public ArrayList<Integer> getPokerIndex() {
        return pokerIndex;
    }

    public Pokers() {
        this.numbers = new String[]{"♠", "♥", "♣", "♦"};
        this.colors = new String[]{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //把大王和小王存储到集合中
        //定义一个牌的索引
        int index = 0;
        pokers.put(index,"大王");
        pokerIndex.add(index);
        index++;
        pokers.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历两个集合,组装52张牌,存储到集合中
        for (String number : numbers) {
            for (String color : colors) {
                pokers.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
    }

    public void getShuffle(){
        Collections.shuffle(pokerIndex);
    }

}

