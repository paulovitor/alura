
LocalDate birthday = LocalDate.of(1975, 9, 23);
LocalDate today = LocalDate.now();

//code here

System.out.println("You are " + d.getYears() + " years, " +
                    d.getMonths() + " months, and " + 
                    d.getDays() + " days old.");

Qual trecho que, se inserido no local, indicado irá imprimir corretamente a idade?

Period d = Period.difference(birthday, today)
Duration d = Duration.between(birthday, today)
Period d = Period.between(today,birthday)
> Period d = Period.between(birthday, today)
