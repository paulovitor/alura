class A {
    public static void main(String[] args) {
        String nome = args[0];
        if(nome.equals("guilherme"))
            System.out.println(nome);
            System.out.println("bom"); // essa linha não pode existir aqui
        else // não aplicado ao if
            System.out.println("melhor ainda");
            System.out.println(nome);
    }
}