class A9 {
    public static void main(String[] args) {
        int valor = 10;
        int dividePor = 4;
        // Quando dividimos 2 inteiros, o resultado é um inteiro, e só depois armazenamos os resultado em um double, fazendo com que o valor da variável resultado seja 2.0
        double resultado = valor / dividePor;

        // Quando estamos imprimindo, a expressão é executada da esquerda para a direita
        // primeiro somamos valor e dividePor, e só ai concatenamos com String
        System.out.println(valor + dividePor + "");

        // primeiro concatenamos primeiro com String, fazendo com que todas as operações subsequentes também sejam concatenações, e não somas
        System.out.println("" + resultado + valor );
    }
}