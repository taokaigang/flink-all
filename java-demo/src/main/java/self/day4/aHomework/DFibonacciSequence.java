package self.day4.aHomework;
/**
 * 4、输出斐波那契数列的前30位
 * */
public class DFibonacciSequence {
    public static void main(String[] args) {
        int m=1,n=1;
        int tmp;
        System.out.println(m);
        for (int i = 2; i <= 30; i++) {
            System.out.println(n);
            if (i%10==0)
                continue;
            tmp=m+n;
            m=n;
            n=tmp;
        }
    }
}
