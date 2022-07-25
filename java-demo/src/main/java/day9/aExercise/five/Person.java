package day9.aExercise.five;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/1
 * @Description
 */
public class Person {
    Hand leftHand;
    Hand rightHand;

    /**
     * 交换两只手中的牌
     */
    void swap() {
        // 左手和右手交换手牌
        leftHand.swap(rightHand);
    }

    /**
     * 展示手里面的牌
     */
    void show() {
        System.out.println("左手：" + leftHand.getInfo());
        System.out.println("右手：" + rightHand.getInfo());
    }
}
