package day14.dCommonClasses;

import java.util.Random;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/9
 * @Description
 */
public class RandomUsage {
    public static void main(String[] args) {
        // 1. 实例化一个Random对象
        Random random = new Random(1);
        // 2. 产生随机数
        for (int i = 0; i < 20; i++) {
            // 产生 [0, 50) 范围内的随机数
            System.out.print(random.nextInt(50) + ", ");
        }
        // 35, 38, 47, 13, 4, 4, 34, 6, 28, 48, 19, 23, 17, 13, 12, 34, 42, 12, 46, 39,
        // 35, 38, 47, 13, 4, 4, 34, 6, 28, 48, 19, 23, 17, 13, 12, 34, 42, 12, 46, 39,
        // 35, 38, 47, 13, 4, 4, 34, 6, 28, 48, 19, 23, 17, 13, 12, 34, 42, 12, 46, 39,
    }
}
