package modelo;

class Cliente {
    private String nome;
    Cliente(String nome) {
        this.nome = nome;
    }
    public void imprime() {
        System.out.println(nome);
    }
}