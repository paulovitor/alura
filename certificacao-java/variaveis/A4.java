class A4 {
    public static void main(String[] args) {
        boolean argumentos;
        // Não compila pois boolean em Java só pode ser false ou true
        if(args.length > 0)
            argumentos = 1;
        else
            argumentos = 0;
        System.out.println(argumentos);
    }
}