public class Teste {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            if (++i % 3 == 0) { // i(1) | i(3)
                break;
            }
        }
        System.out.println(i); // 3
    }
}