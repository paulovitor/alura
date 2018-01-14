class B2 {

    void imprime() {
        String msg;
        // Não compila pois a variável não foi inicializada
        if (!msg.isEmpty())
            System.out.println(msg);
        else
            System.out.println("vazio");
    }
}