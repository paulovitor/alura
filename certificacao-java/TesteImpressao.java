public class TesteImpressao {
    public String toString() {
        return "um objeto do tipo TesteImpressao";
    }
    public static void main(String[] args) {
        System.out.print(1);
        System.out.print(2.0);
        System.out.print("texto");
        System.out.print('a');
        System.out.print(new TesteImpressao()); // chama toString()
        System.out.print(new int[10]); // array é um object
        System.out.print(new char[10]); // não imprime nada!
        char[] letras = {'a', 'b'}; // se tiver um espaço no char da erro ' b'
        System.out.print(letras);
        System.out.print("foo\n");
        System.out.println("bar");
        // format foi add a partir do java 5
        System.out.format("Hello %s, have a nice day!", "Mario"); // inclui a string Mario no lugar do parametro %s (s de string)
        System.out.printf("foo"); // igual ao format (mais legivel para quem utilizava a linguagem C)
        System.out.format("%b %n", false);
        System.out.format("%d %n", 42);
        System.out.format("%f %n", 45.7);
        // System.out.format("%d %n", "a"); // erro de execução! java.util.IllegalFormatConversionException
        System.out.format("%s, o numero : %d esta correto? : %b%n", "Sim", 42, true); // pode interpola muitos valores ao mesmo tempo
        System.out.format(" %s %s ", "World", "Hello"); // segue a ordem de entrada
        System.out.format(" %2$s %1$s ", "World", "Hello"); // indica qual posição "%2$ e %1$" será inserido o valor
        System.out.format(" %2$s %2$s ", "World", "Hello"); // repete o segundo parametro
        System.out.format("[%5d]%n", 42); // tamanho mínimo de 5 caracteres "%5"
        System.out.format("[%5s]%n", "foo");
        System.out.format("[%5s]%n", "foofoo"); // não corta o caracter pois 5 é o valor mínimo
        System.out.format("[%+5d]%n", 42); // se o número for positivo coloca o sinal de +
        System.out.format("[%5d]%n", 42); // não mostra sinal de + (sinal de + não foi habilitado)
        System.out.format("[%+5d]%n", -50); // mostra o sinal de -, pois o número é negativo
        System.out.format("[%5d]%n", -50); // mostra sinal de -, pois o sinal de - é o default (sempre aparece)
        System.out.format("[%(5d]%n", -50); // se o número for negativo aparece entre parentese
        System.out.format("[%(5d]%n", 42); // se for positivo nada acontece
        System.out.format("[%(+5d]%n", 42); // pode usar os dois
        System.out.format("[%+(5d]%n", -50); // se for positivo mostra o sinal de + senão mostra entre ()
        System.out.format("[%-5d]%n", -50); // pode alinhar a esquerda
        System.out.format("[%-5s]%n", "FOO");
        System.out.format("[%05d]%n", -50); // completa os espaços em branco com 0
        // System.out.format("[%05s]%n", "foo"); // erro de execução! (não pode completar com 0 uma string) java.util.FormatFlagsConversionMismatchException
        System.out.format("[%,d]%n", 444584113); // utiliza o separador de milhar do sistema operacional
        System.out.format("[%,f]%n", 444584113.99);
        System.out.format("[%.3f]%n", 444584113.99); // diz quantos números vem depois da vírgula (casas decimais) e arredonda também
        System.out.format("%0,8.2f", 34.589); // 00034.59
        // System.out.format("[%05d]%n", 'a'); // java.util.IllegalFormatConversionException

        java.util.Locale br = new java.util.Locale("pt","BR");
        System.out.printf(br,"%,f %n", 123456.789);
    }
}