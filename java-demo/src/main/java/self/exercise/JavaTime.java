package self.exercise;


import java.time.*;

public class JavaTime {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Instant instantNow = Instant.now();

        LocalDate localDateNow = LocalDate.now();
        LocalTime localTimeNow = LocalTime.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();

        System.out.println("instantNow"+instantNow);


        System.out.println("localDateNow"+localDateNow);
        System.out.println("localTimeNow"+localDateTimeNow);
        System.out.println("localDateTimeNow"+localTimeNow);

        System.out.println("zonedDateTimeNow"+zonedDateTimeNow);
    }

}
