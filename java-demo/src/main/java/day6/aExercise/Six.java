package day6.aExercise;

public class Six {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println(getNumber(i));
        }
    }

    static int getNumber(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return getNumber(index - 1) + getNumber(index - 2);
    }
}
