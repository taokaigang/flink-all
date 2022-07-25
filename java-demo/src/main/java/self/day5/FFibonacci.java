package self.day5;

/**
 * 6. 使⽤递归输出30位的斐波那契数列
 */
public class FFibonacci {
    public static void main(String[] args) {

        for (int i = 1; i < 30; i++) {
            int fibonacci = Fibonacci(i);
            System.out.println(fibonacci);

        }

    }

    /**
     *
     * @param a
     * @return
     */
    static int Fibonacci(int a){
        if(a==1||a==2)
            return 1;
        return Fibonacci(a-1)+Fibonacci(a-2);
    }
}
