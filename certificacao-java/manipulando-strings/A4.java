class A4 {
    String vazio;
    public static void main(String[] args) {
    	// Não compila, pois a variável vazio não é estática
        String full = "Bem-vindo " + vazio;
        System.out.println(full);
    }
}