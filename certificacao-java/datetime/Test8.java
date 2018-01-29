System.out.println(YearMonth.now().isSupported(
    ChronoUnit.MONTHS)); // true
System.out.println(YearMonth.now().isSupported(
    ChronoField.DAY_OF_MONTH)); // false
System.out.println(MonthDay.now().isSupported(
    ChronoField.DAY_OF_MONTH)); // true
System.out.println(LocalDate.now().isSupported(
    ChronoUnit.DAYS)); // true
System.out.println(LocalDate.now().isSupported(
    ChronoUnit.YEAR)); // true
System.out.println(LocalDateTime.now().isSupported(
    ChronoField.HOUR_OF_AMPM)); //
System.out.println(LocalDateTime.now().isSupported(
    ChronoField.YEAR)); // Não existe um valor ChronoUnit.YEAR, e sim ChronoUnit.YEARS