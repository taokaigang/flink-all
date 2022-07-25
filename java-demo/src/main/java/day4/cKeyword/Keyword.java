package day4.cKeyword;

/**
 * 循环中的两个关键字
 *  break、continue
 *
 *  break: 无论循环条件是否成立，立即结束循环
 *  continue: 立即停止本次循环，直接进入下次循环
 *
 */
public class Keyword {
    public static void main(String[] args) {
        // 小明在操场跑步，预计要100米。但是在50米的地方，地上有一个坑。
        for (int meter = 0; meter <= 100; meter++) {

            if (meter == 50) {
                // System.out.println("小明调到坑里面了，脚崴了");
                // break;

                System.out.println("小明想起上次掉坑里了，这一次直接跳过去了");
                continue;
            }

            System.out.println("小明现在跑到了" + meter + "米的位置");
        }
    }
}
