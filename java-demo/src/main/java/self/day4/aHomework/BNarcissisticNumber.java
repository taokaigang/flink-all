package self.day4.aHomework;
/**
* 2、输出所有的水仙花数
*
* */
public class BNarcissisticNumber {
    public static void main(String[] args) {
        int number=100;
        while(number<1000){
            int a=number/100;
            int b=number/10%10;
            int c=number%10;
            if (a*a*a+b*b*b+c*c*c==number){
                System.out.println(number);
            }
            number++;
        }
    }
}
