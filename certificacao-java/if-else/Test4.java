class A {
    public static void main(String[] args) {
        if(args.length==1)
            System.out.println("Um");
        elseif(args.length==2) // não existe palavra-chave elseif, mas existe else if
            System.out.println("Dois");
        elseif(args.length==3) // não existe palavra-chave elseif
            System.out.println("Três");
        else
            System.out.println("Quatro");
    }
}