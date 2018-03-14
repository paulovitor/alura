import java.time.*;
import java.time.temporal.*;
import java.util.*;
public class DateTime3 {
	public static void main(String[] args) {
        Date d10 = new Date();
		Instant i = d10.toInstant();
		LocalDateTime ldt1 = 
			LocalDateTime.ofInstant(i, ZoneId.systemDefault());

		Calendar c = Calendar.getInstance();
		Instant i2 = c.toInstant();
		LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, 
												ZoneId.systemDefault());

		Date d11 = new Date();
		Instant i10 = d11.toInstant();
		LocalDateTime ldt10 = 
			LocalDateTime.ofInstant(i10, ZoneId.systemDefault());

		Instant instant = ldt10.toInstant(ZoneOffset.UTC);
		Date date = Date.from(instant);

        // LocalDate ld = LocalDate.ofInstant(i10); // error compilation
    }
}