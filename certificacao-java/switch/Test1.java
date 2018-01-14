class A {
    public static void main(String[] args) {
        int tamanho = args.length;
        switch(tamanho) {
            case 1: // caso roda-se com 1 iria mostrar 1|2|mais argumentos
                System.out.println("1");
            case 2: // caso roda-se com 2 iria mostrar 2|mais argumentos
                System.out.println("2");
            default: // caso nenhum dos outros
                System.out.println("mais argumentos");
        }
    }
}