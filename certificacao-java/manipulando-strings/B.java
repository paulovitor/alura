class B {
    String msg;

    void imprime() {
    	// Compila, mas dá NullPointerException na execução do programa
        if (!msg.isEmpty())
            System.out.println(msg);
        else
            System.out.println("vazio");
    }
}