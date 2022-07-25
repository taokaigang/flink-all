package self.day4.aHomework;
/**
 * 5、图形打印（每一个图形都需要单独设计一个方法）（注：这是四个题
 *
 * *****     *********      ABCDE           EFGHI
 *  *****     *******        BCDEF         DEFGH
 *   *****     *****          CDEFG       CDEFG
 *    *****     ***            DEFGH     BCDEF
 *     *****     *              EFGHI   ABCDE
 *
 * */
public class FFigureA {
    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++) {
//            //填充空格
//            for (int j = 3; j >= 5 - i; j--) {
//                System.out.print(" ");
//            }
//            //内层循环 每次打印一个*
//            for (int k = 1; k <= 5; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println("=================================");
//
//        for (int m = 1; m <= 5; m++) {
//            //打印空格
//            for (int n = 0; n <= m; n++) {
//                System.out.print(" ");
//            }
//            //打印*
//            for (int x = 1; x <= 9 -2 * (m - 1); x++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println("=================================");
//
//        for (int i = 1; i <=5; i++) {
//            //填充空格
//            for (int j = 3; j >= 5 - i; j--) {
//
//                System.out.print(" ");
//            }
//            //内层循环
//            //for (int k = 1; k <= 5; k++) {
//            for (char k='A';k<='E';k++) {
//                System.out.print(k);
//
//            }
//            System.out.println();
//        }
//
//        System.out.println("=================================");
//
//        for (int i = 1; i <=5; i++) {
//            //填充空格
//            for (int j = 1; j <= 5 - i; j++) {
//
//                System.out.print(" ");
//            }
//            //内层循环
//            //for (int k = 1; k <= 5; k++) {
//            for (char k='A';k<='E';k++) {
//                System.out.print(k);
//
//            }
//            System.out.println();
//        }
        //one();
        two();
        //three();
//        four();

    }

    private static void four() {
    }

    private static void three() {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i+4; j++) {
                if(i>j){
                    System.out.print(" ");
                }else{
                    System.out.print((char)('A'+j-1));
                }
            }
            System.out.println();
        }
    }



    private static void two() {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 9; j >= i; j--) {
//                if(){
//                    System.out.print(" ");
//                }else{
                    System.out.print("*");
                //}
            }
            System.out.println();
        }
    }

    private static void one() {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i+4; j++) {
                if(i>j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}