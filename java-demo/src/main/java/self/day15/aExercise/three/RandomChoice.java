package self.day15.aExercise.three;

import java.util.Random;

public class RandomChoice {

    public String shuffle() {
        Random random = new Random();
        String[] array={"石头","剪刀","布"};
        int index = random.nextInt(array.length);
        return array[index];
    }

}
