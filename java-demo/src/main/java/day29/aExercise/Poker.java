package day29.aExercise;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/29
 * @Description 扑克牌类
 */
public class Poker implements Comparable<Poker> {
    Suit color;     // 花色
    Point point;    // 点数

    public Poker(Suit color, Point point) {
        this.color = color;
        this.point = point;
    }

    @Override
    public String toString() {
        return (this.color == null ? "" : this.color.desc) + this.point.desc;
    }

    @Override
    public int compareTo(Poker o) {
        // 先比较点数
        if (this.point.level != o.point.level) {
            return this.point.level - o.point.level;
        }
        return this.color.level - o.color.level;
    }

    /**
     * 定义花色枚举
     */
    public enum Suit {
        Spade("♠", 4),
        Heart("♥", 3),
        Club("♣", 2),
        Diamond("♦", 1);

        String desc;        // 花色展示的效果
        int level;          // 花色的等级，用来做比较大小的

        private Suit(String desc, int level) {
            this.desc = desc;
            this.level = level;
        }
    }

    /**
     * 点数
     */
    public enum Point {
        P3("3", 1),
        P4("4", 2),
        P5("5", 3),
        P6("6", 4),
        P7("7", 5),
        P8("8", 6),
        P9("9", 7),
        P10("10", 8),
        PJ("J", 9),
        PQ("Q", 10),
        PK("K", 11),
        PA("A", 12),
        P2("2", 13),
        JOKER_LOWER("♛", 14),
        JOKER_HIGHER("♚", 15);

        String desc;         // 点数的描述
        int level;          // 点数的权重

        Point(String desc, int level) {
            this.desc = desc;
            this.level = level;
        }
    }
}
