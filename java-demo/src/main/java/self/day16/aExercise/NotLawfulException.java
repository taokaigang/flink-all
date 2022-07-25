package self.day16.aExercise;

public class NotLawfulException extends RuntimeException {
    public NotLawfulException(){};
    public NotLawfulException(String message){
        super(message);
    };
}
