package self.day28.aExercise;

import java.util.ArrayList;
import java.util.Collections;

public class PokersCtrl {
    private Pokers pokers;

    public void getPokers(){
        pokers.getShuffle();
    }

//    /*
//        3.发牌
//     */
//    //定义4个集合,存储玩家牌的索引,和底牌的索引
//    ArrayList<Integer> player01 = new ArrayList<>();
//    ArrayList<Integer> player02 = new ArrayList<>();
//    ArrayList<Integer> player03 = new ArrayList<>();
//    ArrayList<Integer> diPai = new ArrayList<>();
//    //遍历存储牌索引的List集合,获取每一个牌的索引
//        for (int i = 0; i <pokerIndex.size() ; i++) {
//        Integer in = pokerIndex.get(i);
//        //先判断底牌
//        if(i>=51){
//            //给底牌发牌
//            diPai.add(in);
//        }else if(i%3==0){
//            //给玩家1发牌
//            player01.add(in);
//        }else if(i%3==1){
//            //给玩家2发牌
//            player02.add(in);
//        }else if(i%3==2){
//            //给玩家3发牌
//            player03.add(in);
//        }
//    }
//
//        /*
//            4.排序
//            使用Collections中的方法sort(List)
//            默认是升序排序
//         */
//        Collections.sort(player01);
//        Collections.sort(player02);
//        Collections.sort(player03);
//        Collections.sort(diPai);

}
