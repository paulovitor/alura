class Teste2 {
    static int x = 15;

	// A variável x declarada como parâmetro do método main efetua um shadowing
    public static void main(String[] x) {
        x = 200; // erro de compilação (Não podemos declarar uma variável local com mesmo nome)
        System.out.println(x);
    }
}