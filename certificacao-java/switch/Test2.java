class A {
    public static void main(String[] args) {
        int tamanhoEsperado = 1; // não é uma constante
        int tamanho = args.length;
        switch(tamanho) {
            case tamanhoEsperado: // Somente podemos verificar case de switch em variáveis finais inicializadas diretamente
                System.out.println("1");
                break;
            default:
                System.out.println("cade o argumento?");
        }
    }
}