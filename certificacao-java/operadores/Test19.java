class A {
    public static void main(String[] args) {
        String resultado = "Divisao dá: " + 15 / 0.0; // A precedência de operadores é primeiro a divisão, por isso compila
        System.out.println(resultado);
        // O código compila e imprime: Divisão dá: Infinity
    }
}