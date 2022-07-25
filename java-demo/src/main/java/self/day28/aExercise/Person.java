package self.day28.aExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Person {
    private String name;
    private PokersCtrl pokersCtrl;
    private ArrayList<Integer> player;

    public Person(String name, PokersCtrl pokersCtrl, ArrayList<Integer> player) {
        this.name = name;
        this.pokersCtrl = pokersCtrl;
        this.player = player;
    }

    /*
    定义一个看牌的方法,提高代码的复用性
    参数:
        String name:玩家名称
        HashMap<Integer,String> poker:存储牌的poker集合
        ArrayList<Integer> list:存储玩家和底牌的List集合
    查表法:
         遍历玩家或者底牌集合,获取牌的索引
         使用牌的索引,去Map集合中,找到对应的牌
    */
    public static void lookPoker(String name, HashMap<Integer,String> poker, ArrayList<Integer> list){
        //输出玩家名称,不换行
        System.out.print(name+":");
        //遍历玩家或者底牌集合,获取牌的索引
        for (Integer key : list) {
            //使用牌的索引,去Map集合中,找到对应的牌
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();//打印完每一个玩家的牌,换行
    }

}
