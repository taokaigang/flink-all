package day6.aExercise;

public class Two {
    //  开发⼀个标题为“FlipFlop”的游戏应⽤程序。它从 1 计数到 100，遇到 3 的倍数就替换为单词
    // “Flip”，5 的倍数就替换为单词“Flop” ，既为 3 的倍数⼜为 5 的倍数则替换为单词“FlipFlop”
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FlipFlop");
            }
            else if (i % 3 == 0) {
                System.out.println("Flip");
            }
            else if (i % 5 == 0) {
                System.out.println("Flop");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
