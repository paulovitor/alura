// declaração do pacote
package br.com.caelum.certificacao;

// comentário antes do import
import java.util.Date; // direita do import
import java.io.*;

/** Javadoc
*/
class /* nome da classe */ Pessoa {
	/* tudo que estiver aqui */

	String nome;
    String sobrenome;

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + this.sobrenome;
    }
}

interface Figura {

}