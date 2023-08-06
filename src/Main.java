import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now(); 

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(date.format(formattedDate));
        
    }
}
