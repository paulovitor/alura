class A {
    public static void main(String[] args) {
        double resultado = 15 / 0; // O código compila e joga uma exception por causa da divisão inteira (são ints) por zero
        System.out.println(resultado);
    }
}