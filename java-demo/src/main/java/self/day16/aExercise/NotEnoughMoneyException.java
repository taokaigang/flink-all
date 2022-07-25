package self.day16.aExercise;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(){};

    public NotEnoughMoneyException(String message){
        super(message);
    }
}
