package java8;

public class NewDateTimeApi {
    public static void main(String[] args) {
        System.out.println("Current Local Date: " + java.time.LocalDate.now());
        System.out.println("Current Local Time" + java.time.LocalTime.now());
        System.out.println("Current Local Date and Time " + java.time.LocalDateTime.now());
    }
}
