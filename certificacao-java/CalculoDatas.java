import java.time.*;
import java.time.temporal.*;
public class CalculoDatas {
    public static void main(String[] args) {
        Instant i = Instant.now();
        Duration dezSec = Duration.ofSeconds(10);
        Instant i2 = i.plus(dezSec);

        System.out.println(i);
        System.out.println(i2);

        Instant m1 = Instant.EPOCH; // 1970-01-01
        Instant m2 = Instant.now();

        long segundos = Duration.between(m1, m2).getSeconds();
        System.out.println(segundos);

        LocalDate aniversario = LocalDate.of(1983,7,22);
        LocalDate agora = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(aniversario, agora));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, agora));
        System.out.println(ChronoUnit.DAYS.between(aniversario, agora));

        Period tempoDeVida = Period.between(aniversario, agora);
        System.out.println(tempoDeVida.getYears()); // 33
        System.out.println(tempoDeVida.getMonths()); // faltam para completar +1 ano = 34 anos
        System.out.println(tempoDeVida.getDays()); // faltam para completar +1 mês = 33 anos 12 meses
    }
}