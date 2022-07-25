package day31.aExercise;

import java.util.Random;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/6
 * @Description
 */
public class Three {

    public static void main(String[] args) {
        // 1. 实例化一个随机数对象
        Random random = new Random();
        // 2. 实例化一张银行卡
        BankCard bankCard = new BankCard();
        // 3. 实例化生产线程
        Runnable runnable1 = () -> {
            while (true) {
                bankCard.saveMoney(random.nextInt(1001) + 1000);
            }
        };
        Runnable runnable2 = () -> {
            while (true) {
                bankCard.getMoney(random.nextInt(301) + 300);
            }
        };

        Thread thread1 = new Thread(runnable1, "小明");
        Thread thread2 = new Thread(runnable2, "小美");
        Thread thread3 = new Thread(runnable2, "小娟");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    // 银行卡类
    private static class BankCard {
        // 当前这张银行卡中的余额
        private int money;

        /**
         * 向银行卡中存钱
         * @param money 需要存的钱的数量
         */
        public synchronized void saveMoney(int money) {
            // 存入钱
            this.money += money;
            // 输出日志
            System.out.println(Thread.currentThread().getName() + "往银行卡里面存了" + money + ", 当前余额: " + this.money);
            // 通知所有取钱的人，醒来取钱
            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /**
         * 从银行卡中取钱
         * @param money 需要取的钱
         */
        public synchronized void getMoney(int money) {
            // 取钱
            money = Math.min(this.money, money);
            this.money -= money;
            // 输出日志
            System.out.println(Thread.currentThread().getName() + "从银行卡中取了" + money + ", 当前余额: " + this.money);

            if (this.money <= 0) {
                // 通知小明存钱
                this.notifyAll();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
