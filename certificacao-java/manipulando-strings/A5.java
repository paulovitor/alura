class A5 {
    static String vazio; // valor padrão é null
    public static void main(String[] args) {
    	// Compila e imprime Bem-vindo null
        String full = "Bem-vindo " + vazio;
        System.out.println(full);
    }
}