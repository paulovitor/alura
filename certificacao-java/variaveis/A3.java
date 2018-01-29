class A3 {
    public static void main(String[] args) {
    	// Não compila, do lado direito da atribuição temos um array de boolean e do lado esquerdo
    	// uma variável simples do tipo boolean.
        boolean array = new boolean[300];
        System.out.println(array[3]);
    }
}