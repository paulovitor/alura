System.out.println(YearMonth.now().isSupported(
    ChronoField.DAY_OF_MONTH)); // false
System.out.println(MonthDay.now().isSupported(
    ChronoUnit.DAYS)); // true
System.out.println(LocalDate.now().isSupported(
    ChronoUnit.DAYS)); // true
System.out.println(LocalDateTime.now().isSupported(
    ChronoField.DAY_OF_MONTH)); // true

// A resposta certa é que não compila.
// O método MonthDay.isSupported não aceita parâmetros do tipo ChronoUnit, apenas ChronoField