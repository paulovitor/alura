class Xyz {

    public static void main(String[] args) {
         int y;
         for(int x = 0; x<10; ++x) {
           y = x % 5 + 2;
         }
         System.out.println(y); // Erro: variável não foi inicializada
    }
}