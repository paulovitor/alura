public class Teste {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            if (i++ % 3 == 0) { // i(0) o resto de 0 dividido por qualquer número também é 0
                break;
            }
        }
        System.out.println(i); // 1
    }
}