import java.time.*;
import java.time.temporal.*;
import java.util.*;
public class DateTime1 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now(ZoneId.of("America/Chicago")); // 09:05:03.244
		LocalDate today = LocalDate.now(ZoneId.of("America/Sao_Paulo")); // 2014-12-10
		LocalDateTime now100 = LocalDateTime.now(ZoneId.of("America/Los_Angeles")); // 2014-12-10-09-05-03.244

		System.out.println(currentTime);
		System.out.println(today);
		System.out.println(now100);

		LocalTime noon = LocalTime.of(12, 0);

		LocalDate christmas2014 = LocalDate.of(2014, 12, 25);
		// LocalDate christmas2014 = LocalDate.of(2014, 13, 25); java.time.DateTimeException
		LocalDate christmas2015 = LocalDate.of(2015, Month.DECEMBER, 25);

		MonthDay someChristmas = MonthDay.of(Month.DECEMBER, 31);

		LocalDateTime someDate = 
            LocalDateTime.of(2017, Month.JANUARY, 25, 13, 45);

        LocalDateTime christmasAtNoon = 
    		LocalDateTime.of(christmas2014, noon);

    	LocalDateTime now = LocalDateTime.of(2014,12,15,13,0);

		System.out.println(now.getDayOfMonth()); // 15
		System.out.println(now.getDayOfYear());  // 349
		System.out.println(now.getHour());       // 13
		System.out.println(now.getMinute());     // 0
		System.out.println(now.getYear());       // 2014
		System.out.println(now.getDayOfWeek());  // MONDAY
		System.out.println(now.getMonthValue()); // 12
		System.out.println(now.getMonth());      // DECEMBER

		System.out.println(now.get(ChronoField.DAY_OF_MONTH)); // 15
		System.out.println(now.get(ChronoField.DAY_OF_YEAR)); // 349
		System.out.println(now.get(ChronoField.HOUR_OF_DAY)); // 13
		System.out.println(now.get(ChronoField.MINUTE_OF_HOUR)); // 0
		System.out.println(now.get(ChronoField.YEAR)); // 2014
		System.out.println(now.get(ChronoField.DAY_OF_WEEK)); // 1 (MONDAY)
		System.out.println(now.get(ChronoField.MONTH_OF_YEAR)); // 12


		LocalDate d = LocalDate.now();
		// d.getHour(); //compile error, method not found.
		// d.get(ChronoField.HOUR_OF_DAY); // java.time.temporal.UnsupportedTemporalTypeException

		MonthDay day1 = MonthDay.of(1, 1); //01/jan
		MonthDay day2 = MonthDay.of(1, 2); //02/jan

		System.out.println(day1.isAfter(day2)); //false
		System.out.println(day1.isBefore(day2)); //true

		LocalDate aprilFools = LocalDate.of(2015, 4, 1);
		LocalDate foolsDay = LocalDate.of(2015, 4, 1);
		// são equals?
		System.out.println(aprilFools.isEqual(foolsDay)); //true
		// este objeto suporta dias?
		System.out.println(aprilFools.isSupported(
			ChronoField.DAY_OF_MONTH)); //true
		// este objeto suporta horas?
		System.out.println(aprilFools.isSupported(
			ChronoField.HOUR_OF_DAY)); //false
		// posso fazer operações com dias?
		System.out.println(aprilFools.isSupported(ChronoUnit.DAYS)); 
		//true
		// posso fazer operações com horas?
		System.out.println(aprilFools.isSupported(ChronoUnit.HOURS)); 
		//false


		LocalDate d2 = LocalDate.of(2015, 4, 1); //2014-04-01

		d2 = d2.withDayOfMonth(15).withMonth(3); //chaining
		System.out.println(d2); //2015-03-15

		LocalDate d3 = LocalDate.of(2013, 9, 7);
		System.out.println(d3); // 2013-09-07
		d3.withMonth(12);
		System.out.println(d3); // 2013-09-07

		// LocalTime d = LocalTime.now();
		// d.withDayOfMonth(15); // compile error

		LocalDate d4 = LocalDate.of(2013, 9, 7);
		d4 = d4.plusDays(1).plusMonths(3).minusYears(2);
		System.out.println(d4); // 2011-12-08

		LocalDate d5 = LocalDate.of(2013, 9, 7);
		d5 = d5.plusWeeks(3).minus(3, ChronoUnit.WEEKS);
		System.out.println(d5); // 2011-12-08

		// LocalDate d = LocalDate.of(2013, 9, 7);
		// // UnsupportedTemporalTypeException
		// //LocalDate não suporta horas!
		// d = d.plus(3, ChronoUnit.HOURS); 
		// System.out.println(d);


		LocalDateTime now1 = LocalDateTime.now();
		LocalDate dateNow1 = now1.toLocalDate(); // de DateTime para Date
		LocalTime timeNow1 = now1.toLocalTime(); // de DateTime para Time

		LocalDateTime now2 = LocalDateTime.now();
		LocalDate dateNow2 = now2.toLocalDate(); // de DateTime para Date
		LocalTime timeNow2 = now2.toLocalTime(); // de DateTime para Time

		// de Date para DateTime
		LocalDateTime nowAtTime1 = dateNow2.atTime(timeNow2); 
		// de Time para DateTime
		LocalDateTime nowAtTime2 = timeNow2.atDate(dateNow2);
	}
}