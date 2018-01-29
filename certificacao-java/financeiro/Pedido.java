package financeiro;

import modelo.*;
import static modelo.Util.*;
import java.sql.Date;
import br.com.caelum.certificacao.modelo.*;
import br.com.caelum.certificacao.dao.*;

class Pedido {
	Quadrado quadrado;
	ProdutoDAO dao;

    Pessoa cliente; // Usando a classe Pessoa de outro
    Endereco endereco;
    Date dataDeCriacao;
    java.util.Date dataDeFinalizacao;

    public Pessoa getCliente() {
    	return cliente;
    }

    public void calculaTudo() {
    	int t = TAMANHO;
    	maior(3, 10);
    }
}