package self.day5;

/**
 * 2. 开发⼀个标题为“FlipFlop”的游戏应⽤程序。它从 1 计数到 100，遇到 3 的倍数就替换为单词
 * “Flip”，5 的倍数就替换为单词“Flop” ，既为 3 的倍数⼜为 5 的倍数则替换为单词“FlipFlop”
 */
public class BFlipPlop {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if(i%3==0&&i%5==0){
                System.out.println("FlipFlop");
                continue;
            }
            if(i%3==0){
                System.out.println("Flip");
                continue;
            }
            if(i%5==0){
                System.out.println("Flop");
                continue;
            }
            System.out.println(i);
        }


    }
}
