import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	// ArrayList � r�pido na hora de recuperar - get
	// por�m � lento na inser��o, caso precise add na 1 posi��o,
	// vai ser preciso mover todos os elementos seguintes (consumo de tempo linear)
	
	// LinkedList � mais r�pido na inser��o e remo��o, pois utiliza a estrutura de dados (lista ligada)
	// por�m � lento para recuperar um elemento

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
}
