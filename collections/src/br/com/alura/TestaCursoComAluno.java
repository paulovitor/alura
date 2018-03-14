package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		curso.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(curso.getAlunos());
		System.out.println(alunosSincronizados);
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(curso.estaMatriculado(turini));
		
		Set<Aluno> alunos = curso.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
		
//		Vector<Aluno> vetor = new Vector<>(); // thread safe, implements List
	}
}
