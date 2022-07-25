package self.day4.aHomework;
/**
 * 6、一个四位数字，恰巧等于去掉它首位数字之后所剩的三位数字的3倍，这个四位数字是多少
* */
public class G {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int j=i%1000;
            if (i==j*3){
                System.out.println(i);
            }
        }
    }
}
