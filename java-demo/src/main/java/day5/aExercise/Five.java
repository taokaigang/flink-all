package day5.aExercise;

public class Five {
    /*

        *****       ******* **       ABCDE               EFGHI
         *****       *******         BCDEF             DEFGH
          *****       *****           CDEFG           CDEFG
           *****       ***             DEFGH         BCDEF
            *****       *               EFGHI       ABCDE
     */

    static void one() {
        for (int line = 1; line <= 5; line++) {
            for (int column = 1; column - line <= 4; column++) {
                if (column < line) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void three() {
        for (int line = 1; line <= 5; line++) {
            for (int column = 1; column - line <= 4; column++) {
                if (column < line) {
                    System.out.print(" ");
                }
                else {
                    System.out.print((char)('A' + column - 1));
                }
            }
            System.out.println();
        }
    }

    static void two() {
        for (int line = 1; line <= 5; line++) {
            for (int cloum = 1; cloum + line <= 10; cloum++) {
                if (cloum < line) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void four() {
        for (int line = 1; line <= 5; line++) {
            for (int cloum = 1; cloum + line <= 10; cloum++) {
                if (cloum + line <= 5) {
                    System.out.print(" ");
                }
                else {
                    System.out.print((char)('A' + cloum - 1));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // one();
        // three();
        // two();
        four();
    }


}
