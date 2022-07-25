package day16.eExceptionUsage;


import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/13
 * @Description 双色球类
 */
public class Ball {
    private int[] redBalls;
    private int blueBall;

    // 自选号码实现
    public Ball(int[] redBalls, int blueBall) throws WrongNumberException {
        // 1. 将红球数组中的元素依次拷贝到了属性redBalls中
        this.redBalls = Arrays.copyOf(redBalls, redBalls.length);
        if (this.redBalls.length != 6) {
            throw new WrongNumberException("红球数量有误！");
        }
        // 2. 对红球数组排序
        Arrays.sort(this.redBalls);
        // 3. 范围检查
        if (this.redBalls[0] < 1 || this.redBalls[5] > 33) {
            throw new WrongNumberException("红球范围越界！");
        }
        // 4. 重复校验
        for (int i = 0; i < this.redBalls.length - 1; i++) {
            if (this.redBalls[i] == this.redBalls[i+1]) {
                throw new WrongNumberException("红球重复！");
            }
        }
        // 5. 蓝球的范围检查
        this.blueBall = blueBall;
        if (this.blueBall > 16 || this.blueBall < 1) {
            throw new WrongNumberException("蓝球越界！");
        }
    }

    // 是一个自定义的异常类，描述双色球号码错误信息
    public static class WrongNumberException extends RuntimeException {
        public WrongNumberException(String message) {
            super(message);
        }
    }

    @Override
    public String toString() {
        return "红球: " + Arrays.toString(this.redBalls) + ", 蓝球: " + this.blueBall;
    }
}
