class A3 {
    public static void main(String[] args) {
        String vazio;
        // Não compila pois a String não foi inicializada
        String full = "Bem-vindo " + vazio;
        System.out.println(full);
    }
}