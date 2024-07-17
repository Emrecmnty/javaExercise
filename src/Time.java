import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Güncel Tarih: " + date);


        LocalTime time = LocalTime.now();
        System.out.println("Güncel Zaman: " + time);


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Güncel Tarih ve Zaman: " + dateTime);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatlanmış Tarih ve Zaman: " + formattedDateTime);
    }
}
