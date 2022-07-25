package day18.aExercise.one;

import java.util.Arrays;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/15
 * @Description
 *      【难】从控制台输入一个字符串，记录出现次数最多的字符，并输出这个字符出现了多少次。
 *      例如:
 *      从控制台输入 hello，输出: 出现次数最多的字符是 'l'，出现了2次。
 *      从控制台输入 helle，输出: 出现次数最多是字符是 'l'和'e'，出现了2次
 *
 *      思路:
 *      1. 做一个计数器，用来统计每一个字符出现的次数。
 *      2. 遍历字符串中的每一个字符，在遍历过程中，可以记录每一个字符出现的次数，同时记录最大的次数
 *      3. 遍历这个存储了所有的计数器的数组，找出与最大次数相同的那个字符
 */
public class Program {
    public static void main(String[] args) {
        calculateCount("hello world hh");
    }

    /**
     * 计算一个字符串中，每一个字符出现的次数
     * @param str 统计的字符串
     */
    private static void calculateCount(String str) {
        // 1. 实例化一个数组，用来存储所有的计数器对象
        Counter[] counters = new Counter[str.length()];
        int index = 0;
        // 2. 遍历字符串中的字符
        for (int i = 0; i < str.length(); i++) {
            // 2.1. 得到每一个字符
            char c = str.charAt(i);
            // 2.2. 判断这个字符，是否已经统计过了
            Counter counter = getCounter(counters, c);
            // 2.3. 判断是否存在
            if (counter == null) {
                // 说明这个字符是第一次遇到，之前没有统计过
                counters[index++] = new Counter(c, 1);
            }
            else {
                // 说明这个字符不是第一次遇到，之前统计过
                counter.times++;
            }
        }

        // 3. 将数组中的元素，按照出现的次数进行降序排序
        // Arrays.sort(counters, 0, index, (c1, c2) -> c2.times - c1.times);
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - 1 - i; j++) {
                if (counters[j].times < counters[j+1].times) {
                    Counter tmp = counters[j];
                    counters[j] = counters[j+1];
                    counters[j+1] = tmp;
                }
            }
        }

        // 4. 拼接结果
        String result = "出现次数最多的字符是: ";
        for (Counter counter : counters) {
            if (counter != null && counter.times == counters[0].times) {
                result += "'" + counter.c + "'" + "和";
            }
        }

        result = result.substring(0, result.length() - 1).concat(", 出现的次数是: ").concat(String.valueOf(counters[0].times));

        System.out.println(result);
    }

    /**
     * 从一个存储了所有计数器的数组中，查找指定的字符是否出现了
     * @param counters 计数器数组
     * @param c 需要查找的字符
     * @return  计数器对象，如果这个字符之前没有出现，则返回null
     */
    private static Counter getCounter(Counter[] counters, char c) {
        for (Counter counter : counters) {
            if (counter == null) {
                return null;
            }
            if (counter.c == c) {
                return counter;
            }
        }
        return null;
    }
}

// 计数器类: 记录某一个字符出现的次数
class Counter {
    char c;     // 统计的字符
    int times;  // 字符出现的次数

    public Counter(char c, int times) {
        this.c = c;
        this.times = times;
    }
}
