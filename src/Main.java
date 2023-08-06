import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dateAndTime = LocalDateTime.now(); 

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formattedDay = DateTimeFormatter.ofPattern("EEEE");

        System.out.println(dateAndTime.format(formattedDate));
        System.out.println(dateAndTime.format(formattedDay));
        System.out.println(dateAndTime.format(formattedTime));
    }
}
