package self.day11.aExercise.one;

public class PersonComparatorImpl implements PersonComparator {

    @Override
    public int compute(int a, int b) {
        if (a>b){
            return 1;
        }else if (a==b){
            return 0;
        }else {
            return -1;
        }
    }
}
