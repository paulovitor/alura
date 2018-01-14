import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
public class FormatandoDatas {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/JJ/yyyy"); // java.lang.IllegalArgumentException
        System.out.println(formatter.format(agora));
        System.out.println(agora.format(formatter));

        // LocalDate d1 = LocalDate.parse("23/22/1982", formatter); // java.time.format.DateTimeParseException
        LocalDate d1 = LocalDate.parse("23/08/1982", formatter);
        System.out.println(d1);
    }
}