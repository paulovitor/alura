class A {
    public static void main(String[] args) {
        String resultado = ("divisao dá: " + 15) / 0.0; // Não compila pois o resultado do parenteses é uma String que não possui o operador de divisão
        System.out.println(resultado);
    }
}