package day15.aExercise;

import java.util.Arrays;
import java.util.Random;

/**
 *      双色球类：
 *      属性：红球数组、蓝球数字
 *      方法：自选号码、机选号码、和另外一个双色球进行校验、对比
 */
public class Ball {
    private int[] redBalls;     // 红球数组
    private int blueBall;       // 蓝球数字

    /**
     * 通过一个红球数组和一个蓝球，实例化一注双色球
     * @param redBalls 红球数组
     * @param blueBall 蓝球
     */
    public Ball(int[] redBalls, int blueBall) {
        // 1. 校验蓝色球是否在合法的范围内
        if (blueBall >= 1 && blueBall <= 16) {
            this.blueBall = blueBall;
        } else {
            System.out.println("蓝球范围超标");
            return;
        }

        // 2. 将红球数组中的元素都拷贝到当前的属性数组中
        this.redBalls = Arrays.copyOf(redBalls, redBalls.length);
        // 3. 将红球数组中的元素升序排列
        Arrays.sort(this.redBalls);
        // 4. 进行范围检查
        if (this.redBalls[0] < 1 || this.redBalls[5] > 33) {
            System.out.println("红球范围超标");
            this.redBalls = null;
            return;
        }
        // 5. 进行红球的重复验证
        for (int i = 0; i < this.redBalls.length - 1; i++) {
            if (this.redBalls[i] == this.redBalls[i + 1]) {
                System.out.println("红球重复");
                this.redBalls = null;
                return;
            }
        }
    }

    /**
     * 通过无参构造，获取一注随机的双色球
     */
    public Ball() {
        // 1. 实例化一个随机数对象
        Random random = new Random();
        // 2. 准备一个存储有所有的红色球能够取到的值的数组
        int[] data = new int[33];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        // 3. 实例化红球数组
        this.redBalls = new int[6];
        // 4. 填充红球数组
        for (int i = 0; i < this.redBalls.length; i++) {
            // 4.1. 从数据源中，随机生成一个下标
            int randomIndex = random.nextInt(data.length);
            // 4.2. 将这个下标的元素存入到红球数组中
            this.redBalls[i] = data[randomIndex];
            // 4.3. 将这个元素，从数据源中移除
            System.arraycopy(data, randomIndex + 1, data, randomIndex, data.length - 1 - randomIndex);
            // 4.4. 修改data的内容
            data = Arrays.copyOf(data, data.length - 1);
        }
        // 5. 红球数组排序
        Arrays.sort(this.redBalls);
        // 6. 生成随机的蓝球
        this.blueBall = random.nextInt(16) + 1;
    }

    @Override
    public String toString() {
        String str = "红球: ";
        // 遍历红球数组，拼接每一个数字
        for (int i = 0; i < this.redBalls.length; i++) {
            if (i < this.redBalls.length - 1) {
                str += getNumberStr(this.redBalls[i]) + ", ";
            }
            else {
                str += getNumberStr(this.redBalls[i]) + " ";
            }
        }

        // 拼接蓝球数字
        str += "蓝球: " + getNumberStr(this.blueBall);

        return str;
    }

    // 把一个数字转成字符串，如果数字不到10，往前补0
    private String getNumberStr(int number) {
        return number < 10 ? "0" + number : String.valueOf(number);
    }

    /**
     * 使用一注双色球，和另外一注双色球进行比对，得出中奖等级
     * @param otherBall 需要对比的双色球
     * @return 奖项等级
     */
    public int getTicketLevel(Ball otherBall) {
        // 核心点：找出两注双色球中红球和蓝球相同的数量
        int redCount = 0, blueCount = 0;
        // 计算红球的中奖数量
        for (int redBall : this.redBalls) {
            // 判断红球是否在另外一个数组中包含
            if (MyArrayTools.contains(otherBall.redBalls, redBall)) {
                redCount++;
            }
        }
        // 计算蓝球中奖数量
        blueCount = this.blueBall == otherBall.blueBall ? 1 : 0;

        // 计算中奖等级
        if (redCount == 6 && blueCount == 1) {
            return 1;
        }
        else if (redCount == 6 && blueCount == 0) {
            return 2;
        }
        else if (redCount == 5 && blueCount == 1) {
            return 3;
        }
        else if (redCount + blueCount == 5) {
            return 4;
        }
        else if (redCount + blueCount == 4) {
            return 5;
        }
        else if (blueCount == 1) {
            return 6;
        }
        else {
            return 7;
        }
    }
}
