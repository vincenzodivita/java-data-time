import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dateAndTime = LocalDateTime.now(); 

        DateTimeFormatter formattedDateAndTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(dateAndTime.format(formattedDateAndTime));
        
    }
}
