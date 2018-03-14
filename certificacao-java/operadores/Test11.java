public class Teste{
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = -128;
        byte b3 = b1 + b2; // Não compila! Toda conta devolve no mínimo um int
        System.out.println(b3);
    }
}