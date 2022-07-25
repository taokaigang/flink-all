package day4.eLoop;

public class Exercise3 {
    public static void main(String[] args) {
        // 古典问题：“百钱白鸡”
        // 已知一只母鸡5元，一只公鸡3元，3只小鸡1元。有100元钱，需要买100只鸡。
        // 要求：正好把100元花完，同时正好买100只鸡。
        // 列出所有的购买方案。
        for (int g = 0; g <= 100 / 3; g++) {
            for (int m = 0; m <= 100 / 5; m++) {
                for (int x = 0; x <= 100; x+=3) {
                    if (g + x + m == 100 && g * 3 + m * 5 + x / 3 == 100) {
                        System.out.println("公鸡: " + g + ", 母鸡: " + m + ", 小鸡: " + x);
                    }
                }
            }
        }
    }
}
