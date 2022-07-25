package self.day5;

/**
 * 3. 两个⾃然数X，Y相除，商3余10，被除数、除数、商、余数的和是163，求被除数、除数。
 */
public class CDividendDivisor {
    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            if(i+3*i+10+3+10==163){
//                System.out.println("被除数是："+(3*i+10));
//                System.out.println("除数是："+i);
//            }
        for (int i = 0; i < 163; i++) {
            for (int j = 1; j < 163; j++) {
                int s=i/j;
                int yu=i%j;
                if(s==3&&yu==10&&(s+yu+i+j)==163){
                    System.out.println(i);
                    System.out.println(j);
            }
        }

        }
    }
}
