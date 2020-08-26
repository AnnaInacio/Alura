package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos oa alunos matriculados: ");
		
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
		
		Vector<Aluno> vetor = new Vector<>();
		
//		for (Aluno aluno : javaColecoes.getAlunos()) {
//		    System.out.println(aluno);
//		}
		
		
//		javaColecoes.getAlunos().forEach(aluno -> {
//			System.out.println(aluno);
//		});
		
		System.out.println("O aluno " + a1 + " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 � equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		//Obrigatoriamente o seguinte � true:
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
		
		
		
		
		
	
		//da um exception - exerc�cio
//		Set<Aluno> alunos = javaColecoes.getAlunos();
//		alunos.add(new Aluno("Anna", 9527));
//		System.out.println(alunos);
	}

}
