package day6.aExercise;

public class Three {
    // 两个⾃然数X，Y相除，商3余10，被除数、除数、商、余数的和是163，求被除数、除数
    public static void main(String[] args) {
        // 被除数的遍历
        for (int i = 11; i < 150; i++) {
            // 除数的遍历
            for (int j = 1; j < i; j++) {
                // 求商
                int s = i / j;
                // 求余
                int l = i % j;
                // 判断条件
                if (s == 3 && l == 10 && s + l + i + j == 163) {
                    System.out.println("被除数是: " + i + "，除数是: " + j);
                }
            }
        }
    }
}
