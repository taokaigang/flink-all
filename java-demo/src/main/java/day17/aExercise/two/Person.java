package day17.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description
 */
public class Person {
    private int money;          // 小明身上的钱
    public Person(int money) {
        this.money = money;
    }

    /**
     * 支付饭钱
     * @param cost 饭钱
     */
    public void pay(int cost) throws NotEnoughMoneyException {
        System.out.println("我的兜里有" + money + "元");
        System.out.println("这顿饭钱是" + cost + "元");
        if (this.money >= cost) {
            System.out.println("我的钱够！可以支付！");
        }
        else {
            // 钱不够支付饭钱的情况
            throw new NotEnoughMoneyException();
        }
    }
}
