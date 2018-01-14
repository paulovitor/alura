import modelo.Cliente;
class Teste {
    public static void main(String[] args) {
        new Cliente("guilherme").imprime(); // Erro de compilação
    }
}

package modelo;

public class Cliente {
    private String nome;
    Cliente(String nome) { // construtor default
        this.nome = nome;
    }
    public void imprime() {
        System.out.println(nome);
    }
}