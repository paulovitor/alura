
import java.util.regex;

public class TesteRegex {
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");
        Matcher matcher = pattern.matcher("11a22b33c");
        // boolean encontrou = matcher.find();

        while (matcher.find()) {
            String match = matcher.group();
            String groupo1 = macher.group(1);
            String groupo2 = macher.group(2);

            int start = macher.start();
            int end = macher.end();

            System.out.printf("%s | %s | %s [%d,%d] %n", match, groupo1, groupo2, start, end);
        }

        String data = "2007-12-31";
        Pattern pattern = Pattern.compile("(\\d{4})(-)(\\d{2})(-)(\\d{2})");
        Matcher matcher = pattern.matcher(data);

        if (matcher.matches()) {

            String ano = matcher.group(1);
            String mes = matcher.group(3);
            String dia = matcher.group(5);

            String separador1 = matcher.group(2);
            String separador2 = matcher.group(4);

            String novaData = dia + separador1 + mes + separador2 + ano;
            novaData.replaceAll("-", "/");
            System.out.println(novaData);
        }
    }
}