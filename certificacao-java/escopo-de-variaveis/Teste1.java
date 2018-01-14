class Teste1 {
    public static void main(String[] args) {
        // a variável i declarada no for, só é visível dentro do for, 
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        // por isso podemos declará-la novamente logo em seguida
        int i = 15;
        System.out.println(i);
    }
}