class A {
    public static void main(String[] args) {
    	// entra em loop infinito caso seja passado zero, um ou dois argumentos
        if(args.length < 10) {
            do {
                if(args.length>2) return; // Não imprime nada caso 3 a 9 argumentos
            } while(true);
        }
        System.out.println("Finalizou"); // Imprime 'Finalizou' caso 10 ou mais argumentos
    }
}