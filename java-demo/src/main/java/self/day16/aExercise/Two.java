package self.day16.aExercise;

import java.util.Random;

public class Two {
    /**
     * 2. 小明去饭店吃饭，身上带了22块钱，随机产生[15,30]范围的饭钱，如果小明的钱不够支付饭钱，抛
     * 出一个NotEnoughMoneyException的运行时异常。
     * @param args
     */
    public static void main(String[] args) {
        Random random=new Random();
        int i = random.nextInt(15 + 1)+15;//[15,31)
        if (i>22){
            throw new NotEnoughMoneyException("钱不够支付饭钱！");
        }else {
            System.out.println("小明支付饭钱成功！");
        }
    }
}
