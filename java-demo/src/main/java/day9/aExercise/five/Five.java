package day9.aExercise.five;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Five {
    // 小明交换牌：小明左手和右手分别拿了一张扑克牌，需要交换两只手中的扑克牌。最后小明展示交换后的扑克牌。扑克牌有花色和点数属性。
    // 类的设计：人、手、扑克牌
    public static void main(String[] args) {
        // 1. 实例化两张扑克牌
        Poker poker1 = new Poker();
        poker1.color = "黑桃";
        poker1.point = "A";

        Poker poker2 = new Poker();
        poker2.color = "红桃";
        poker2.point = "K";

        // 2. 实例化两只手
        Hand left = new Hand();
        left.poker = poker1;

        Hand right = new Hand();
        right.poker = poker2;

        // 3. 实例化人类对象
        Person xiaoming = new Person();
        xiaoming.leftHand = left;
        xiaoming.rightHand = right;

        // 4. 展示一下牌
        xiaoming.show();
        System.out.println("交换牌");
        xiaoming.swap();
        xiaoming.show();
    }
}
