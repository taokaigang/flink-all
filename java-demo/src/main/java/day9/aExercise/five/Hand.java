package day9.aExercise.five;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Hand {
    Poker poker;        // 手里的扑克牌

    /**
     * 交换自己和指定的一只手中的牌
     * @param hand 需要交换的手
     */
    void swap(Hand hand) {
        Poker tmp = hand.poker;
        hand.poker = poker;
        poker = tmp;
    }

    String getInfo() {
        return poker.getInfo();
    }
}
