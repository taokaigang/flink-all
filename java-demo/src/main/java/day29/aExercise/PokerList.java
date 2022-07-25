package day29.aExercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 牌堆
 */
public class PokerList {
    private List<Poker> list;   // 牌堆中所有的扑克牌

    /**
     * 从牌堆中取出一张牌
     * @return 一张扑克牌
     */
    public Poker get() {
        return list.remove(0);
    }

    public PokerList() {
        list = new LinkedList<>();

        // 获取所有的枚举值
        Poker.Point[] values = Poker.Point.values();
        for (Poker.Point value : values) {
            if (value.level >= 14) {
                continue;
            }
            list.add(new Poker(Poker.Suit.Spade, value));   // 黑桃的值
            list.add(new Poker(Poker.Suit.Heart, value));   // 红桃的值
            list.add(new Poker(Poker.Suit.Club, value));    // 梅花的值
            list.add(new Poker(Poker.Suit.Diamond, value)); // 方片的值
        }

        // 添加大小王
        list.add(new Poker(null, Poker.Point.JOKER_LOWER));
        list.add(new Poker(null, Poker.Point.JOKER_HIGHER));

        // 洗牌
        Collections.shuffle(list);
    }


}
