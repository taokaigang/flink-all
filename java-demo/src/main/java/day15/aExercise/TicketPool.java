package day15.aExercise;

/**
 * @Description 奖池
 */
public class TicketPool {
    public static int getMoney(int level) {
        switch (level) {
            case 1: return 5000000;
            case 2: return 400000;
            case 3: return 3000;
            case 4: return 200;
            case 5: return 10;
            case 6: return 5;

            default: return 0;
        }
    }
}
