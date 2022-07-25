package day17.aExercise.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/14
 * @Description
 *      小明去饭店吃饭，身上带了22块钱，随机产生[15, 30]范围的饭钱，
 *      如果小明的钱不够支付饭钱，抛出一个 NotEnoughMoneyException 的运行时异常。
 */
public class Test {
    public static void main(String[] args) {
        // 1. 随机生成一个数字
        int cost = (int)(Math.random() * 16) + 15;
        // 2. 实例化小明
        Person xiaoming = new Person(22);
        // 3. 让小明支付饭钱
        try {
            xiaoming.pay(cost);
        }
        catch (NotEnoughMoneyException e) {
            System.out.println("小明: 我的钱不够了，打折行不行？？");
            System.out.println("老板: 可以，打骨折");
        }
    }
}

