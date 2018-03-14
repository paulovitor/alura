package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		// conjunto de objetos que n�o sabemos a ordem
		// n�o aceita elementos repetidos
		// Alta performance nos m�todos de busca contains
		// Boa performance no m�todo de inser��o add, um pouco menos que List
		Set<String> alunos = new HashSet<>();

		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior

		System.out.println(alunos);
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		// o HashSet utiliza uma tabela de espalhamento para tentar fazer a busca em tempo constante, tornando a busca mais r�pida
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		
		System.out.println(pauloEstaMatriculado);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
	}
}
