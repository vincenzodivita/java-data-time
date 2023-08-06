import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); 

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(date.format(formattedDate));
        
    }
}
